package br.com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Prestador extends Pessoa implements Serializable {
    List<DadosProfissionais> dadosProfissionaisList = new ArrayList();

    //Atributos
    private int idPrestador;
    private static int idPrestadorCount = 1;
    private String cnpj;
    private String fone;
    private DadosAcademicos curso;
    private DadosProfissionais prof;


    //Getters e Setters

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public DadosAcademicos getCurso() {
        return curso;
    }

    public void setCurso(DadosAcademicos curso) {
        this.curso = curso;
    }

    public DadosProfissionais getProf() {
        return prof;
    }

    public void setProf(DadosProfissionais prof) {
        this.prof = prof;
    }

    public void adicionarProfissao(DadosProfissionais dadosProfissionais){
        this.dadosProfissionaisList.add(dadosProfissionais);
    }


    //Construtores

    public Prestador(int idPrestador, String cnpj, String fone, int codCadastro, String nome, String sobrenome, String dtNascimento, char genero, String email, String rg, String cpf, String experiencia) {
        super(codCadastro, nome, sobrenome, dtNascimento, genero, email, fone, rg, cpf, experiencia);
        this.idPrestador = idPrestador;
        this.cnpj = cnpj;
        this.fone = fone;
    }
    public Prestador(int idPessoa, String nome, String cpf, String cnpj, DadosProfissionais prof) {
        super(idPessoa, nome, cpf);
        this.idPrestador = idPrestadorCount++;
        this.cnpj = cnpj;
        this.prof = prof;
    }

    DadosAcademicos getcurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Prestador{" + "idPrestador=" + idPrestador + ", curso=" + curso + ", prof=" + prof + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.cnpj != null ? this.fone.hashCode() : 0);
        hash = 19 * hash + (this.cnpj != null ? this.fone.hashCode() : 0);
        return hash;
    }

}
