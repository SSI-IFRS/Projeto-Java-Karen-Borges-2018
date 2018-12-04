package br.com.principal;

import br.com.control.Processador;
import javax.swing.JOptionPane;

/**
 *
 * @author karen
 */
public class InterfaceMenuPrincipal {

    public static void exibir(){
        //Teste do tiulo
        boolean ok = true;
        while(ok==true) {
            try {
                String opcao = leitor("Escolha a opção:"
                        + "\n1 - Cliente"
                        + "\n2 - Prestador"
                        + "\n______________"
                        + "\n3 - Encerrar");
                Processador.direcionar (opcao);
                ok = true;
            } catch (CampoVazioException cve) {
                JOptionPane.showMessageDialog(null, cve);
                ok = false;
            } catch (NullPointerException npe) {
                int n = JOptionPane.showConfirmDialog(
                        null, "Deseja encerrar o programa?",
                        "Este título é editável...! blablabla",
                        JOptionPane.YES_NO_OPTION);
                if (n == JOptionPane.YES_OPTION) {
                    //new InterfaceSair().executar();
                    System.exit(0);
                } else if (n == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Então digite algo...");
                } else {
                    JOptionPane.showMessageDialog(null, "Teste...");
                }
            }
        }
    }

    public static String leitor(String mensagem) throws CampoVazioException, NullPointerException{
        String dado=JOptionPane.showInputDialog(null, mensagem);
        if (dado.equals("")){
            throw new CampoVazioException("Você não preencheu o campo");
        }
        return dado;
    }

}
