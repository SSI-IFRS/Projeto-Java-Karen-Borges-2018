package br.com.model;


/**
 *
 * @author Ariél
 */
public class DadosAcademicos {
    private int idDadosAcademico;
    private boolean situacaoCurso;
    private String dtIngresso;
    private String dtFinal;
    private String curso;
    private String instituicao;

    /**
     * @return the cod_dados_academ
     */
    public int getCod_dados_academ() {
        return idDadosAcademico;
    }


    public int getIdDadosAcademico() {
        return idDadosAcademico;
    }

    public void setIdDadosAcademico(int idDadosAcademico) {
        this.idDadosAcademico = idDadosAcademico;
    }

    public boolean isSituacaoCurso() {
        return situacaoCurso;
    }

    public void setSituacaoCurso(boolean situacaoCurso) {
        this.situacaoCurso = situacaoCurso;
    }

    /**
     * @return the dtIngresso
     */
    public String getDtIngresso() {
        return dtIngresso;
    }

    /**
     * @param dtIngresso the dtIngresso to set
     */
    public void setDtIngresso(String dtIngresso) {
        this.dtIngresso = dtIngresso;
    }

    /**
     * @return the dtFinal
     */
    public String getDtFinal() {
        return dtFinal;
    }

    /**
     * @param dtFinal the dtFinal to set
     */
    public void setDtFinal(String dtFinal) {
        this.dtFinal = dtFinal;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public DadosAcademicos(int id_dados_academ, boolean situacao, String dtIngresso, String dtFinal, String curso, String instituicao) {
        this.idDadosAcademico = id_dados_academ;
        this.situacaoCurso = situacao;
        this.dtIngresso = dtIngresso;
        this.dtFinal = dtFinal;
        this.curso = curso;
        this.instituicao = instituicao;
    }


    @Override
    public String toString() {
        return "DadosAcademicos{" + "idDadosAcademico=" + idDadosAcademico + ", situacaoCurso=" + situacaoCurso + ", dtIngresso=" + dtIngresso + ", dtFinal=" + dtFinal + ", curso=" + curso + ", instituicao=" + instituicao + '}';
    }

}
