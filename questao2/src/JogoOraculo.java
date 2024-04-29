package questao2.src;

import java.util.Scanner;

public class JogoOraculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do guerreiro: ");
        String nomeGuerreiro = scanner.nextLine();

        Guerreiro guerreiro = new Guerreiro(nomeGuerreiro);
        Oraculo oraculoMaster = new Oraculo();

        // Simule o jogo aqui (loadLevel1, loadLevel2, etc.)
        // Exiba os prólogos, resultados e comportamento conforme o descritivo do jogo.

        scanner.close();
    }
}
