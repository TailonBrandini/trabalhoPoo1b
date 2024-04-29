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
    List<Aposta> apostasAtivas;

    public Jogador(String nome, String sobrenome, String apelido, String cpf, String nacionalidade, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.saldo = 100000.0;
        this.moeda = "R$";
        this.apostasAtivas = new ArrayList<>();
    }

    public boolean fazerAposta(Jogo jogo, double valorAposta) {
        if (verificarAposta(jogo, valorAposta)) {
            Aposta aposta = new Aposta(0, valorAposta, jogo, this);
            apostasAtivas.add(aposta);
            saldo -= valorAposta;
            return true;
        } else {
            return false;
        }
    }

    public void cancelarAposta(Aposta aposta) {
        if (apostasAtivas.contains(aposta)) {
            if (!aposta.isFinalizada()) {
                saldo += aposta.getValorAposta();
                apostasAtivas.remove(aposta);
                InOut.MsgDeInformacao("Aposta cancelada", "Aposta de " + this.nome + " cancelada com sucesso!");
            } else {
                InOut.MsgDeAviso("Aviso", "Aposta já finalizada.");
            }
        } else {
            InOut.MsgDeAviso("Aviso", "Aposta não encontrada.");
        }
    }

    private boolean verificarAposta(Jogo jogo, double valorAposta) {
        return saldo >= valorAposta && valorAposta <= jogo.getApostaMax();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Aposta> getApostasAtivas() {
        return apostasAtivas;
    }

    public void atualizarSaldo(double valor) {
        this.saldo += valor;
    }

    public List<Aposta> getAllApostas() {
        return apostasAtivas;
    }

    public static List<Jogador> jogadoresCadastrados = new ArrayList<>();

    public static Jogador[] getAllJogadores() {
        return jogadoresCadastrados.toArray(new Jogador[0]);
    }
}
