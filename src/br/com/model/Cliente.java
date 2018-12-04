package br.com.model;

public class Cliente extends Pessoa {
    private int idCliente;
    private static int idClienteCount = 1;

    public static int getIdClienteCount() {
        idClienteCount++;
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

    @Override
    public String toString() {
        return (
                "\nId Cliente = " + getIdClienteCount() +
                "\nNome Cliente = " + getNome() +
                "\nCPF Cliente = " + getCpf() +
                "\n--------\n"
        );
    }
}

