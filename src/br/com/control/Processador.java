package br.com.control;

import br.com.principal.MenuCliente;
import br.com.principal.MenuPrestador;

import javax.swing.*;
import java.util.HashMap;

/**
 *
 * @author KAREN
 */
public class Processador {

    private static final HashMap comandos = new HashMap();

    public static void direcionar(String cmd) {
        int opc = Integer.parseInt(cmd);
        switch (opc) {
            case 1:
                JOptionPane.showMessageDialog(null, "Cliente");
                MenuCliente.exibir();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Prestador");
                MenuPrestador.exibeMenuPrestador();
                break;
            case 3:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
