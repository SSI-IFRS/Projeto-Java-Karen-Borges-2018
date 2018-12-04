package br.com.principal;

import br.com.control.*;
import br.com.model.*;

import java.util.ArrayList;
import javax.swing.*;

public class MenuCliente extends InstanciaCliente{


    public static void exibir() {


        PessoaDAO cadastro = new PessoaDAO();
        ClienteDAO cadastroCliente = new ClienteDAO();
        InstanciaCliente testeCliente = new InstanciaCliente();
        int opcao;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "Escolha opção: \n"
                            + "1 - Inserir\n"
                            + "2 - Excluir\n"
                            + "3 - Pesquisar por CPF\n"
                            + "4 - Editar\n"
                            + "5 - Listar Clientes\n"
                            + "6 - Opções Prestador\n"
                            + "7 - Voltar Menu Principal");

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
                    cadastroCliente = new ClienteDAO(InstanciaCliente.main());
                    JOptionPane.showMessageDialog(null, "Dados encontrados: " + InstanciaCliente.main());
                    break;
                case 6:
                    InterfaceMenuPrincipal.exibir();
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 7);


    }

}
