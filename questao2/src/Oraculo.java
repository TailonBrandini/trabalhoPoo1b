package questao2.src;

import java.util.Random;
import java.util.Scanner;

class Oraculo {
    // ... (código anterior)

    public boolean loadLevel2(Guerreiro guerreiro) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Charada: O que é, o que é? Tem folhas, mas não é árvore.");
        System.out.print("Resposta do Guerreiro: ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("livro")) {
            return true; // Guerreiro acertou
        } else {
            guerreiro.setQtVidas(guerreiro.getQtVidas() - 1);
            return false; // Guerreiro errou
        }
    }

    // ... (outros métodos)
}
