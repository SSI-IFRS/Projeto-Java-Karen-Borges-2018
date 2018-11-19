package br.com.model;

/**
 *
 * @author 0341185
 */
public class Feedback {

    private int id_Feedback;
    private String mensagem;
    private int pontuacao;

    public Feedback(int id_Feedback, String mensagem, int pontuacao) {
        this.id_Feedback = id_Feedback;
        this.mensagem = mensagem;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return "Feedback{" + "id_Feedback=" + id_Feedback + ", mensagem=" + mensagem + ", pontuacao=" + pontuacao + '}';
    }



    public int getId_Feedback() {
        return id_Feedback;
    }

    public void setId_Feedback(int id_Feedback) {
        this.id_Feedback = id_Feedback;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }


}
