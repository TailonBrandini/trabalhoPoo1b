
package questao3.src;

import questao3.lib.InOut;

class Jogo {

    private String descricao;
    private double apostaMax;


    public Jogo(String descricao, double apostaMax) {
        this.descricao = descricao;
        this.apostaMax = apostaMax;
        InOut.MsgDeAviso("Teste", "Coloquei isso só para não dar erro na importação do InOut.....depois pode tirar");
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

