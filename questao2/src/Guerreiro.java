package questao2.src;

class Guerreiro {
    private String nome;
    private int qtVidas;

    public Guerreiro(String nome) {
        this.nome = nome;
        this.qtVidas = 0; // Inicializa com zero vidas
    }

    public String getNome() {
        return nome;
    }

    public int getQtVidas() {
        return qtVidas;
    }

    public void setQtVidas(int qtVidas) {
        this.qtVidas = qtVidas;
    }
}
