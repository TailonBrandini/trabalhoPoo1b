
package questao3.src;

import questao3.lib.InOut;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogador {

    String nome;
    String sobrenome;
    String apelido;
    String cpf;
    String nacionalidade;
    Date dataNascimento;
    double saldo;
    String moeda;
    List<Aposta> apostasAtivas = new ArrayList<>();

    public Jogador(String nome, String sobrenome, String apelido, String cpf, String nacionalidade, Date dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.saldo = 0.0;
        this.moeda = "R$";
        this.apostasAtivas = new ArrayList<>();
    }

    
    public void fazerAposta(Jogo jogo, double valorAposta) {
        InOut.MsgDeAviso("Teste", "Coloquei isso só para não dar erro na importação do InOut.....depois pode tirar");
    }

    public void cancelarAposta(Aposta aposta) {

    }

    public double getSaldo() {
        return saldo;
    }

    public List<Aposta> getApostasAtivas() {
        return apostasAtivas;
    }
}
