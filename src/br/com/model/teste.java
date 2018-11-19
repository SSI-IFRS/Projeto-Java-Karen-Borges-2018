package br.com.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0341185
 */
public class teste {

    public static void main(String[] args) {
        // create an array list type Cliente
        ArrayList <Cliente> c0 = new ArrayList<>();
        System.out.println("Initial size of Cliente: " + c0.size());

        // Add new objects to the ArrayList.
        c0.add(new Cliente(1,"Fulano","032465"));
        c0.add(new Cliente(2,"Beltrano","987456"));
        c0.add(new Cliente(3,"Ciclano","010203"));

        // Display elements in our list.
        System.out.println("\n-----** Clientes **-----\n");
        for (Cliente cliente : c0) {
            System.out.println(
                    cliente.getIdPessoa() + " / " +
                    cliente.getIdCliente() + " / " +
                    cliente.getNome() + " / " +
                    cliente.getCpf());
        }
        System.out.println("-------------------\n");

        //Cliente index
        Cliente elementCliente = c0.get(2); //Com o metodo "get" podemos acessar a posição do elemento dentro do array
        System.out.println("\nO terceiro elemento do array de clientes é:\n" + " - " + elementCliente);

       //Total de elementos do ArrayList - método "size"
        System.out.println("\nTotal de Clientes cadastrados: " + c0.size());


        //--------prestador--------
        // create an array list type Prestador
        ArrayList <Prestador> p1 = new ArrayList<>();
        System.out.println("Initial size of Prestador: " + p1.size());

        // Add new objects to the ArrayList.
        p1.add(new Prestador(5,"João","020202"));
        p1.add(new Prestador(6,"Maria","030303"));
        p1.add(new Prestador(7,"Pablo","040404"));


        // Creating an ArrayList from another collection
        List<Prestador> collectionPrestador = new ArrayList<>(p1);


        List<Prestador> listPrestador = new ArrayList<>();
        listPrestador.add(new Prestador(8,"José","080808"));
        listPrestador.add(new Prestador(9,"Adriana","090909"));
        listPrestador.add(new Prestador(10,"Ernesto","101010"));
        listPrestador.add(new Prestador(11,"Karen","110011"));

        // Adding an entire collection to an ArrayList
        collectionPrestador.addAll(listPrestador);

        System.out.println(collectionPrestador);

        // Display elements in our list.
        System.out.println("\n-----** Prestador **-----\n");
        for (Prestador prestador : collectionPrestador) {
            System.out.println(
                    prestador.getIdPessoa() + " / " +
                            prestador.getIdPrestador() + " / " +
                            prestador.getNome() + " / " +
                            prestador.getCpf());
        }
        System.out.println("-------------------\n");

        //Cliente index
        Prestador elementPrestador = collectionPrestador.get(0); //Com o metodo "get" podemos acessar a posição do elemento dentro do array
        System.out.println("\nO primeiro elemento do array de Prestador é:\n" + " - " + elementPrestador);

        //Total de elementos do ArrayList - método "size"
        System.out.println("\nTotal de Prestadores cadastrados: " + collectionPrestador.size());

        //-----------------------
    }
}
