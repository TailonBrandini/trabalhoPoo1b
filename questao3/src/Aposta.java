package questao3.src;

import questao3.lib.InOut;



public class Aposta {
    int idAposta;
    double valorAposta;
    int repetir;

    boolean isFinalizada;
    boolean resultado; 

    public void calcularPremio() {

       // double potencialPremio;
        InOut.MsgDeInformacao("Teste sera que funcionou","Potencial prêmio: ");
    }

    public void registrarResultado(boolean resultado) {
        this.isFinalizada = true;
        this.resultado = resultado;

        if (resultado) {
            System.out.println("Parabéns! Você venceu esta aposta!");
        } else {
            System.out.println("Infelizmente, você perdeu nesta aposta.");
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
}
