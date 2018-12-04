package br.com.model;

/**
 *
 * @author 0341185
 */
public class DadosProfissionais {

    private int idProfissional;
    private String nomeEmpresa;
    private String cbo;
    private String tempoServico;

    public int getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCbo() {
        return cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }

    public String getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(String tempoServico) {
        this.tempoServico = tempoServico;
    }


    public DadosProfissionais(int idProfissional, String nomeEmpresa, String cbo, String tempoServico) {
        this.idProfissional = idProfissional;
        this.nomeEmpresa = nomeEmpresa;
        this.cbo = cbo;
        this.tempoServico = tempoServico;
    }

    public DadosProfissionais (int idProfissional, String cbo){
        this.idProfissional = idProfissional;
        this.cbo = cbo;
    }
    @Override
    public String toString() {
        return "DadosProfissionais{" + "idProfissional=" + idProfissional + ", NomeEmpresa=" + nomeEmpresa + ", Cbo=" + cbo + ", TempoServico=" + tempoServico + '}';
    }
}
