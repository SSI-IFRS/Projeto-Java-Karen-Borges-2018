/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariél
 */
public class Cadastro {
    private String cod_cadastro;
    private String nome;
    private String sobrenome;
    private String data_nascimento;
    private char   genero;
    private String email;
    private String fone;
    private String rg;
    private String cpf;

    /**
     * @return the cod_cadastro
     */
    public String getCod_cadastro() {
        return cod_cadastro;
    }

    public Cadastro(String cod_cadastro, String nome, String sobrenome, String data_nascimento, char genero, String email, String fone, String rg, String cpf) {
        this.cod_cadastro = cod_cadastro;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.email = email;
        this.fone = fone;
        this.rg = rg;
        this.cpf = cpf;
    }

    /**
     * @param cod_cadastro the cod_cadastro to set
     */
    public void setCod_cadastro(String cod_cadastro) {
        this.cod_cadastro = cod_cadastro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the data_nascimento
     */
    public String getData_nascimento() {
        return data_nascimento;
    }

    /**
     * @param data_nascimento the data_nascimento to set
     */
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
