package questao3.src;

public class Jogo {

    private String descricao;
    private double apostaMax;

    public Jogo(String descricao, double apostaMax) {
        this.descricao = descricao;
        this.apostaMax = apostaMax;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getApostaMax() {
        return apostaMax;
    }

    public void setApostaMax(double apostaMax) {
        this.apostaMax = apostaMax;
    }
}
