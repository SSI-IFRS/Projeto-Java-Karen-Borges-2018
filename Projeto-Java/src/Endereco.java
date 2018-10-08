/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariél
 */
public class Endereco {
    private String cod_cidade;
    private String UF;
    private String cep;
    private String logradouro;
    private String bairro;
    private String numero;
    private String rg;
    private String cpf;

    /**
     * @return the cod_cidade
     */
    public String getCod_cidade() {
        return cod_cidade;
    }

    /**
     * @param cod_cidade the cod_cidade to set
     */
    public void setCod_cidade(String cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Endereco(String cod_cidade, String UF, String cep, String logradouro, String bairro, String numero, String rg, String cpf) {
        this.cod_cidade = cod_cidade;
        this.UF = UF;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.rg = rg;
        this.cpf = cpf;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
