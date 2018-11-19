package br.com.model;

/**
 *
 * @author 0341185
 */
public class DadosProfissionais {

    private int idProfissional;
    private String NomeEmpresa;
    private String Funcao;
    private String TempoServico;

    public int getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String NomeEmpresa) {
        this.NomeEmpresa = NomeEmpresa;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
    public String getTempoServico() {
        return TempoServico;
    }

    public void setTempoServico(String TempoServico) {
        this.TempoServico = TempoServico;
    }


    public DadosProfissionais(int idProfissional, String NomeEmpresa, String Funcao, String TempoServico) {
        this.idProfissional = idProfissional;
        this.NomeEmpresa = NomeEmpresa;
        this.Funcao = Funcao;
        this.TempoServico = TempoServico;
    }


    @Override
    public String toString() {
        return "DadosProfissionais{" + "idProfissional=" + idProfissional + ", NomeEmpresa=" + NomeEmpresa + ", Funcao=" + Funcao + ", TempoServico=" + TempoServico + '}';
    }
}
