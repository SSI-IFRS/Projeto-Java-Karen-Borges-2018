package br.com.principal;

import br.com.model.Cliente;

import java.util.ArrayList;

public class InstanciaCliente {

    public static ArrayList<Cliente> main() {
        // create an array list type Cliente
        ArrayList <Cliente> c0 = new ArrayList<>();
        //System.out.println("Initial size of Cliente: " + c0.size());

        // Add new objects to the ArrayList.
        c0.add(new Cliente(1,"Fulano","032465"));
        c0.add(new Cliente(2,"Beltrano","987456"));
        c0.add(new Cliente(3,"Ciclano","010203"));
        c0.add(new Cliente(4,"Maria","492231"));

        return c0;

    }

    

}
