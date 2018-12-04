package br.com.principal;

public class CampoVazioException extends Exception {

    /**
     * Creates a new instance of <code>CampoVazioException</code> without detail message.
     */
    public CampoVazioException() {
    }

    /**
     * Constructs an instance of <code>CampoVazioException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public CampoVazioException(String msg) {
        super(msg);
    }
}
