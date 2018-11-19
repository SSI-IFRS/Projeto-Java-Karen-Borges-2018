package br.com.model;

public class Cliente extends Pessoa {
    private int idCliente;
    private static int idClienteCount = 1;

    public static int getIdClienteCount() {
        return idClienteCount;
    }

    public static void setIdClienteCount(int idClienteCount) {
        Cliente.idClienteCount = idClienteCount;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(int idPessoa, String nome, String cpf) {
        super(idPessoa, nome, cpf);
        this.idCliente = idClienteCount++;
    }

}

