package br.com.control;

import br.com.DAO.interfaceDAO;
import br.com.model.Cliente;
import br.com.model.Prestador;

import java.util.ArrayList;

public class PrestadorDAO implements interfaceDAO {

    private ArrayList listaPrestador = new ArrayList();

    public PrestadorDAO(ArrayList dados) {
        listaPrestador = dados;
    }

    public PrestadorDAO() {
        listaPrestador = new ArrayList();
    }

    @Override
    public boolean inserir(Object obj) {
        if (obj instanceof Cliente) {
            listaPrestador.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public boolean excluir(Object obj) {
        boolean resposta = listaPrestador.remove(obj);
        return resposta;
    }

    @Override
    public Object pesquisar(Object obj) {
        String cpf;
        if (obj != null && obj instanceof String) {
            cpf = (String) obj;
            for (int i = 0; i < listaPrestador.size(); i++) {
                Prestador p1 = (Prestador) listaPrestador.get(i);
                if (p1.getCpf().equals(cpf)) {
                    return p1;
                }
            }
        }
        return null;
    }
   /* //Não consegui converter o Caledar para inteiroentão implementeção não fora atualizada
    public ArrayList pesquisar(int idade) {
         Calendar cal = GregorianCalendar.getInstance();
      cal.get(Calendar.YEAR);
     ArrayList grupo = new ArrayList();
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            Pessoa p = (Pessoa) it.next();

            if (p.getDtNascimento() - Integer.parseInt cal == idade) {
                grupo.add(p);
            }
        }
        return grupo;
    }
*/

    @Override
    public boolean editar(Object obj) {
        return false;
    }


}

