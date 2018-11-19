package br.com.model;

public class Pessoa {

    //---Atributos
    private int idPessoa;
    private String login;
    private String senha;
    private String nome;
    private String sobrenome;
    private String dtNascimento;//alterar para tipo calender
    private char genero;
    private String email;
    private String fone;
    private String rg;
    private String cpf;
    private String experiencia;

    public Pessoa(int idPessoa, String nome, String cpf) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;

    }



    //----Getters and Setters
    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String Experiencia) {
        this.experiencia = Experiencia;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //-------CONSTRUTOR

    public Pessoa(int codCadastro, String nome, String sobrenome, String dtNascimento, char genero, String email, String fone, String rg, String cpf, String Experiencia) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtNascimento = dtNascimento;
        this.genero = genero;
        this.email = email;
        this.fone = fone;
        this.rg = rg;
        this.cpf = cpf;
        this.experiencia = Experiencia;
    }


    /*
        @Override
        public String toString() {
            return "Pessoa{" + "idPessoa=" + idPessoa + ", login=" + login + ", senha=" + senha + ", nome=" + nome + ", sobrenome=" + sobrenome + ", dtNascimento=" + dtNascimento + ", genero=" + genero + ", email=" + email + ", fone=" + fone + ", rg=" + rg + ", cpf=" + cpf + ", experiencia=" + experiencia + '}';
        }*/
    @Override
    public String toString() {
        return "Pessoa{" +
                "\n\tidPessoa= " + idPessoa +
                "\n\tNome= " + nome +
                "\n\tCpf= " + cpf + "\n}";
    }
}
