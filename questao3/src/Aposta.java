package questao3.src;

import questao3.lib.InOut;

public class Aposta {
    int idAposta;
    double valorAposta;
    int repetir;
    double saldo;
    Jogo jogo;
    Jogador jogador;

    boolean isFinalizada;
    boolean resultado; 
    public void calcularPremio() {
        InOut.MsgDeInformacao("Teste será que funcionou", "Potencial prêmio: ");
    }

    public void registrarResultado(boolean resultado) {
        this.isFinalizada = true;
        this.resultado = resultado;

        if (resultado) {
            InOut.MsgSemIcone("Parabéns!", "Você venceu esta aposta!");
        } else {
            InOut.MsgSemIcone("Infelizmente", "Você perdeu nesta aposta.");
        }
    }

    public boolean isFinalizada() {
        return isFinalizada;
    }

    public void setIsFinalizada(boolean isFinalizada) {
        this.isFinalizada = isFinalizada;
    }

    public boolean getResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public double getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(double valorAposta) {
        this.valorAposta = valorAposta;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void atualizarSaldo(double valor) {
        saldo += valor;
    }
}
