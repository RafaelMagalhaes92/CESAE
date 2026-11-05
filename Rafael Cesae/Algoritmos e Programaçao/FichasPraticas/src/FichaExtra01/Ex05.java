package FichaExtra01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, palpite, tentativas = 0;

        System.out.println("Numero aleatório: ");
        numero = input.nextInt();

        while (tentativas < 2) {
            System.out.println("Adivinhe o número (1 a 100): ");
            palpite = input.nextInt();

            tentativas++;

            if (palpite == numero) {
                System.out.println("Boa! Ganhaste o jogo!");
                break;
            } else if (palpite > numero) {
                System.out.println("Muito alto.");
            } else
                System.out.println("Muito baixo");

        }
        if(tentativas == 2) {
            System.out.println("Ficaste sem tentativas");
        }
    }
}

