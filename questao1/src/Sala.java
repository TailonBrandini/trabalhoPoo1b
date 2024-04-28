package questao1.src;

import java.util.ArrayList;
import java.util.List;

import questao1.lib.InOut;

public class Sala {
    private int idSala = 0;
    int numAssentos;
    String tipoTela;
    String localizacao;
    // Agregação entre Sala e Sessao, 1 para muitos...
    List<Sessao> salas = new ArrayList<>();

    public Sala() {
        
    }

    public void criarAmbienteCompleto() {
        Sala novaSala = new Sala();
        novaSala.idSala++;
        novaSala.numAssentos = InOut.leInt("Quantos assentos deseja que sua sala tenha: ");
        novaSala.tipoTela = InOut.leString("Tipo de tela: ");
        novaSala.localizacao = InOut.leString("Onde estará localizada...?");

        InOut.MsgDeInformacao("Sala criada", "Sala com id de número: " + novaSala.idSala + "\n" + novaSala.numAssentos + " assentos,\n" + "Tipo de tela: " + novaSala.tipoTela + "\n" + "E localizado " + novaSala.localizacao + ".");

    InOut.MsgDeInformacao("Vamos dar sequência", "Pronto, sala criada. Agora precisamos criar uma ou mais sessões, para podermos criar os filmes que serão assistidos nessa sala... ");

    
        
    }

    // public void criarSala() {
    //     idSala = InOut.leInt("Digite um ID para sua sala");
    //     localizacao = InOut.leString("Onde sua sala estará localizada?");
    //     numAssentos = InOut.leInt("Quantos assentos a sala tem?");
    //     tipoTela = InOut.leString("Qual o tipo de tela da sala?");
    // }

    
    // public int setIdSala(int idSala) {
    //     getIdSala();
    //     idSala = InOut.leInt("Digite o novo id");
    //     return this.idSala = idSala;
    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }




    void statusSala() {
        System.out.println("Sala localizada em: " + localizacao + ";\n Id " + idSala + " e " + numAssentos + " assentos, com tela " + tipoTela + ".");
    } 
}
// "Sala localizada em: " + localizacao, ";\n Id " + idSala, " e " + numAssentos + " assentos, com tela " + tipoTela + "."


//Código funcionando

/*public void criarSala() {
        Sala novaSala = new Sala();
        novaSala.idSala++;
        novaSala.numAssentos = InOut.leInt("Quantos assentos deseja que sua sala tenha: ");
        novaSala.tipoTela = InOut.leString("Tipo de tela: ");
        novaSala.localizacao = InOut.leString("Onde estará localizada...?");

        InOut.MsgDeInformacao("Sala criada", "Sala com id de número: " + novaSala.idSala + "\n" + novaSala.numAssentos + " assentos,\n" + "Tipo de tela: " + novaSala.tipoTela + "\n" + "E localizado " + novaSala.localizacao + "."); */