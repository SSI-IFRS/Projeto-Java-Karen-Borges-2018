package br.com.model;

/**
 *
 * @author 0341185
 */
public class PessoaJuridica {

    private int idPessoaJuridica;
    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(int idPessoaJuridica, String cnpj, String nomeFantasia) {
        this.idPessoaJuridica = idPessoaJuridica;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "idPessoaJuridica=" + idPessoaJuridica + ", cnpj=" + cnpj + ", nomeFantasia=" + nomeFantasia + '}';
    }


    public int getIdPessoaJuridica() {
        return idPessoaJuridica;
    }

    public void setIdPessoaJuridica(int idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String Nome_Empresa) {
        this.nomeFantasia = Nome_Empresa;
    }


}
