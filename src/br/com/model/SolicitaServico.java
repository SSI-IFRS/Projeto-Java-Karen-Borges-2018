package br.com.model;

/**
 *
 * @author 0341185
 */
public class SolicitaServico {

    private int idServico;
    private String nomeServico;

    public SolicitaServico(int idServico, String nomeServico) {
        this.idServico = idServico;
        this.nomeServico = nomeServico;
    }

    @Override
    public String toString() {
        return "Servico{" + "idServico=" + idServico + ", nomeServico=" + nomeServico + '}';
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }


}
