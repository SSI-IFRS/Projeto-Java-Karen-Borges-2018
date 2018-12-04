package br.com.principal;

import br.com.control.PessoaDAO;
import br.com.control.PrestadorDAO;
import br.com.model.Pessoa;

import javax.swing.*;
import java.util.ArrayList;

public class MenuPrestador extends InstanciaPrestador{

    public static void exibeMenuPrestador(){

        PessoaDAO cadastro = new PessoaDAO();
        PrestadorDAO cadastroPrestador = new PrestadorDAO();
        InstanciaPrestador testePrestador = new InstanciaPrestador();
        int opcao;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "Escolha opção: \n"
                            + "1 - Inserir\n"
                            + "2 - Excluir\n"
                            + "3 - Pesquisar por CPF\n"
                            + "4 - Pesquisar por CBO (Ocupação)\n"
                            + "5 - Lista Prestador\n"
                            + "6 - Voltar Menu Principal\n"
                            + "7 - Sair");

            opcao = new Integer(input);

            String nome;
            String i;
            int idPessoa;
            String cpf;

            switch(opcao) {
                case 1:
                    nome = JOptionPane.showInputDialog(null, "Informe o nome");
                    i = JOptionPane.showInputDialog(null, "Informe a id");
                    idPessoa = Integer.parseInt(i);
                    cpf = JOptionPane.showInputDialog(null, "Informe o CPF");
                    Pessoa p = new Pessoa(idPessoa, nome, cpf);
                    cadastro.inserir(p);
                    break;
                case 2:
                    cpf = JOptionPane.showInputDialog(null, "Informe o cpf");
                    p = (Pessoa) cadastro.pesquisar(cpf);
                    cadastro.excluir(p);
                    break;
                case 3:
                    cpf = JOptionPane.showInputDialog(null, "Informe o CPF");
                    p = (Pessoa) cadastro.pesquisar(cpf);
                    JOptionPane.showMessageDialog(null, "Dados encontrados: " + p);
                    break;
                case 4:
                    i = JOptionPane.showInputDialog(null, "Informe a idade");
                    idPessoa = Integer.parseInt(i);
                            ArrayList lista;
                    lista = (ArrayList) cadastro.pesquisar(idPessoa);
                    for (int j = 0; j < lista.size(); j++) {
                                p = (Pessoa) lista.get(j);
                                JOptionPane.showMessageDialog(null, "Dados encontrados: " + p);
                           }
                    break;
                case 5:
                    cadastroPrestador = new PrestadorDAO(InstanciaPrestador.main());
                    JOptionPane.showMessageDialog(null, "Dados encontrados: " + InstanciaPrestador.main());
                    break;
                case 6:
                    InterfaceMenuPrincipal.exibir();
                case 7:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 7);


    }
}
