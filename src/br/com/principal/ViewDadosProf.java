package br.com.principal;

import br.com.model.Cliente;
import br.com.model.DadosProfissionais;

import java.util.ArrayList;

public class ViewDadosProf {

    public static ArrayList<DadosProfissionais> main() {

        ArrayList <DadosProfissionais> dp1 = new ArrayList<>();

        // Add new objects to the ArrayList.
        dp1.add(new DadosProfissionais(1, "Advogado"));
        dp1.add(new DadosProfissionais(2, "Eletricista"));
        dp1.add(new DadosProfissionais(3, "Técnico Refrigeração"));
        dp1.add(new DadosProfissionais(4, "Motoboy"));
        dp1.add(new DadosProfissionais(5, "Arquiteto"));

        return dp1;

    }

    

}
