package questao3.src;

import questao3.lib.InOut;

public class Aposta {
    private static final double FATOR_PREMIO = 2.0;
    int idAposta;
    double valorAposta;
    Jogo jogo;
    Jogador jogador;
    boolean isFinalizada;
    boolean resultado;

    public Aposta(int idAposta, double valorAposta, Jogo jogo, Jogador jogador) {
        this.idAposta = idAposta;
        this.valorAposta = valorAposta;
        this.jogo = jogo;
        this.jogador = jogador;
        this.isFinalizada = true;
        this.resultado = true;
    }

    public void calcularPremio() {
        double premio = 2000.0;
        if (resultado) {
            premio = valorAposta * FATOR_PREMIO;
        } else {
            premio = 0.0;
        }
        InOut.MsgSemIcone("Prêmio da Aposta #" + idAposta, "Prêmio: " + premio);
    }

    public void registrarResultado(boolean resultado) {
        this.isFinalizada = true;
        this.resultado = resultado;

        if (resultado) {
            InOut.MsgDeInformacao("VOCÊ GANHOU A APOSTA","Parabéns! Você venceu esta aposta!");
        } else {
            InOut.MsgDeInformacao("VOCÊ PERDEU A APOSTA","Infelizmente você perdeu nesta aposta.");
        }
    }

    public boolean isFinalizada() {
        return isFinalizada;
    }

    public boolean getResultado() {
        return resultado;
    }

    public int getIdAposta() {
        return idAposta;
    }

    public double getValorAposta() {
        return valorAposta;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public Jogador getJogador() {
        return jogador;
    }
}
