package br.com.principal;

import br.com.model.DadosProfissionais;
import br.com.model.Prestador;

import java.util.ArrayList;

public class InstanciaPrestador {

    public static ArrayList<Prestador> main() {
        // create an array list type Cliente
        ArrayList <Prestador> p1 = new ArrayList<>();

        // Add new objects to the ArrayList.
        p1.add(new Prestador(1, "Juca", "88888", "78787-8", new DadosProfissionais(1, "Advogado")));
        p1.add(new Prestador(2, "Aline S.", "9999", "656565-6", new DadosProfissionais(2, "Motoboy")));
        p1.add(new Prestador(3, "Monica", "77777", "141414-4", new DadosProfissionais(3, "Arquiteto")));
        p1.add(new Prestador(4, "Cebolinha", "66666", "131313-3", new DadosProfissionais(4, "Encanador")));

        return p1;

    }

    

}
