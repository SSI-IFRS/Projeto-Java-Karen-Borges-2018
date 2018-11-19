package br.com.model;

public class Prestador extends Pessoa {
    //Atributos
    private int idPrestador;
    private static int idPrestadorCount = 1;
    private int cnpj;
    private  String fone;
    private DadosAcademicos curso;
    private DadosProfissionais prof;


    //Getters e Setters

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
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


    //Construtores

    public Prestador(int idPrestador, int cnpj, String fone, int codCadastro, String nome, String sobrenome, String dtNascimento, char genero, String email, String rg, String cpf, String experiencia) {
        super(codCadastro, nome, sobrenome, dtNascimento, genero, email, fone, rg, cpf, experiencia);
        this.idPrestador = idPrestador;
        this.cnpj = cnpj;
        this.fone = fone;
    }
    public Prestador(int idPessoa, String nome, String cpf) {
        super(idPessoa, nome, cpf);
        this.idPrestador = idPrestadorCount++;
    }

    DadosAcademicos getcurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Prestador{" + "idPrestador=" + idPrestador + ", curso=" + curso + ", prof=" + prof + '}';
    }



}
