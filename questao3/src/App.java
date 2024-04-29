package questao3.src;

import questao3.lib.InOut;


public class App {
    public static void main(String[] args) {
        int opcao;
        do {
            InOut.MsgDeInformacao("POO bet",
                    "Seja bem vindo ao POO bet\n\n As opções disponíveis são: \n [1] CADASTRAR E FAZER APOSTA \n [2] LISTAR TODAS AS APOSTAS \n[0] SAIR DO POO BET");

            opcao = InOut.leInt("Escolha uma opção: ");

            switch (opcao) {
                case 0:
                    InOut.MsgSemIcone("Menu", "Saindo...");
                    break;
                case 1:
                    cadastrarEFazerAposta();
                    break;
                case 2:
                    listarApostas();
                    break;
                default:
                    InOut.MsgDeErro("Menu", "Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 0);
    }

    public static void cadastrarEFazerAposta() {
        String nome = InOut.leString("Digite o nome do jogador: ");
        String sobrenome = InOut.leString("Digite o sobrenome do jogador: ");
        String apelido = InOut.leString("Digite o apelido do jogador: ");
        String cpf = InOut.leString("Digite o CPF do jogador: ");
        String nacionalidade = InOut.leString("Digite a nacionalidade do jogador: ");
        String dataNascimento = InOut.leString("Digite sua data de nascimento: (DD/MM/AAAA)");

        Jogador jogador = new Jogador(nome, sobrenome, apelido, cpf, nacionalidade, dataNascimento);
        Jogador.jogadoresCadastrados.add(jogador);

        do {
            String descricaoJogo = InOut.leString("Digite a descrição do jogo: ");
            double apostaMaxima = InOut.leDouble("Digite o valor máximo da aposta para este jogo: ");
            Jogo jogo = new Jogo(descricaoJogo, apostaMaxima);

            double valorAposta = InOut.leDouble("Digite o valor da aposta: ");

            if (jogador.getSaldo() >= valorAposta) {
                if (jogador.fazerAposta(jogo, valorAposta)) {
                    InOut.MsgSemIcone("Menu", "Saldo do jogador após a aposta: " + jogador.getSaldo());

                    if (!jogador.getApostasAtivas().isEmpty()) {
                        int opcaoCancelar = InOut.leInt("Deseja cancelar a aposta realizada? (1 - Sim / 0 - Não): ");
                        if (opcaoCancelar == 1) {
                            Aposta aposta = jogador.getApostasAtivas().get(jogador.getApostasAtivas().size() - 1);
                            jogador.cancelarAposta(aposta);
                            InOut.MsgSemIcone("Menu",
                                    "Aposta cancelada com sucesso. Saldo atual do jogador: " + jogador.getSaldo());
                        }
                    }

                    int continuarApostando = InOut.leInt("Deseja continuar apostando? (1 - Sim / 0 - Não): ");
                    if (continuarApostando == 0) {
                        break;
                    }
                } else {
                    InOut.MsgDeErro("Menu",
                            "Não foi possível fazer a aposta. Verifique seu saldo e o valor da aposta.");
                }
            } else {
                InOut.MsgDeErro("Menu", "Saldo insuficiente para realizar a aposta.");
            }
        } while (true);
    }

    public static void listarApostas() {
        for (Jogador jogador : Jogador.jogadoresCadastrados) {
            InOut.MsgSemIcone("Apostas de " + jogador.nome, "Total de apostas: " + jogador.getAllApostas().size());
            for (Aposta aposta : jogador.getAllApostas()) {
                InOut.MsgSemIcone("Aposta #" + aposta.getIdAposta(),
                        "Valor: " + aposta.getValorAposta() + ", Jogo: " + aposta.getJogo().getDescricao());
                aposta.calcularPremio();
            }
        }
    }
}
