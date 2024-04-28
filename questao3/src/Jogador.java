package questao3.src;

import java.util.ArrayList;
import java.util.List;
import questao3.lib.InOut;

public class Jogador {

    String nome;
    String sobrenome;
    String apelido;
    String cpf;
    String nacionalidade;
    String dataNascimento;
    double saldo;
    String moeda;
    List<Aposta> apostasAtivas = new ArrayList<>();

    public Jogador(String nome, String sobrenome, String apelido, String cpf, String nacionalidade, String dataNascimento) {
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
        if (saldo >= valorAposta && valorAposta <= jogo.getApostaMax()) {
            Aposta aposta = new Aposta();
            aposta.valorAposta = valorAposta;
            aposta.jogo = jogo;
            apostasAtivas.add(aposta);
            saldo -= valorAposta; // Atualiza o saldo do jogador
            InOut.MsgDeInformacao("Aposta realizada", "Aposta de " + this.nome + " realizada com sucesso!");
        } else {
            if (saldo < valorAposta) {
                InOut.MsgDeAviso("Aviso", "Saldo insuficiente para realizar a aposta.");
            } else {
                InOut.MsgDeAviso("Aviso", "O valor da aposta excede o limite máximo.");
            }
        }
    }

    public void cancelarAposta(Aposta aposta) {
        if (apostasAtivas.contains(aposta) && !aposta.isFinalizada()) {
            saldo += aposta.valorAposta;
            apostasAtivas.remove(aposta);
            InOut.MsgDeInformacao("Aposta cancelada", "Aposta de " + this.nome + " cancelada com sucesso!");
        } else {
            InOut.MsgDeAviso("Aviso", "Aposta não encontrada ou já finalizada.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Aposta> getApostasAtivas() {
        return apostasAtivas;
    }
}
