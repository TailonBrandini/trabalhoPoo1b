package questao3.src;
import java.util.Date;

import questao3.lib.InOut;
public class App {
    public static void main(String[] args) throws Exception {
    
        String nome = InOut.leString("Digite o nome do jogador: ");
        String sobrenome = InOut.leString("Digite o sobrenome do jogador: ");
        String apelido = InOut.leString("Digite o apelido do jogador: ");
        String cpf = InOut.leString("Digite o CPF do jogador: ");
        String nacionalidade = InOut.leString("Digite a nacionalidade do jogador: ");
        Date dataNascimento = new Date(); 
        Jogador jogador = new Jogador(nome, sobrenome, apelido, cpf, nacionalidade, dataNascimento);


        String descricaoJogo = InOut.leString("Digite a descrição do jogo: ");
        double apostaMaxima = InOut.leDouble("Digite o valor máximo da aposta para este jogo: ");
        Jogo jogo = new Jogo(descricaoJogo, apostaMaxima);

        double valorAposta = InOut.leDouble("Digite o valor da aposta: ");
        jogador.fazerAposta(jogo, valorAposta);


        InOut.MsgSemIcone("Título", "Saldo do jogador após a aposta: " + jogador.getSaldo());


        Aposta aposta = jogador.getApostasAtivas().get(0);
        jogador.cancelarAposta(aposta);

        InOut.MsgSemIcone("Título", "Saldo do jogador após cancelar a aposta: " + jogador.getSaldo());
    }
    }

