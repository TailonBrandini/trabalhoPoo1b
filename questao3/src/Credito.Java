package questao3.src;

public class Credito {
    double saldo;
    String validade;
    String moeda;
    boolean bloqueado;

    public Credito(double saldo, String validade, String moeda, boolean bloqueado) {
        this.saldo = saldo;
        this.validade = validade;
        this.moeda = moeda;
        this.bloqueado = bloqueado;
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
}
