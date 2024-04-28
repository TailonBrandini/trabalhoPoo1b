package questao1.src;

// import java.lang.runtime.SwitchBootstraps;

import questao1.lib.InOut;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws Exception {

        
        int opcao = 1;
        
        InOut.MsgDeInformacao("Sistema de Filmes","Seja bem vindo ao Sistema de FIlmes\n\n As opções disponíveis são: \n [1] CRIAR FILME COMPLETO\n [2] EXCLUIR FILME \n [3] LISTAR FILME \n [0] SAIR DO SISTEMA" );
    
        while (opcao != 0) {
           opcao = InOut.leInt("Escolha a opção desejada: \n [1] CRIAR AMBIENTE COMPLETO\n [2] EXCLUIR FILME \n [3] LISTAR FILME \n [0] SAIR DO SISTEMA" );


            switch (opcao) {
                case 1:
                int qtdSalas = InOut.leInt("Quantas salas deseja criar neste momento? ");
                for(int i = 0; i < qtdSalas;){
                    Sala teste = new Sala();
                teste.criarAmbienteCompleto();
                    break;
                }
                
                case 2:
                Filme filme = new Filme();
                filme.criarFilme();
                    break;
                
                case 3:
                // Listar filme

                default:
                    break;
            }
    

        }
        
        // Sala teste = new Sala();
        // teste.criarSala();

        // Filme filme = new Filme();
        // filme.criarFilme();

    




        
        // sala1.idSala = InOut.leInt("Qual id você quer para sua sala? (Somente inteiros)");
        // sala1.localizacao = "Ao lado direiro do banheiro";
        // sala1.numAssentos = 80;
        // sala1.tipoTela = "Full hd 80'";
        // sala1.status();
        
    }
}