package FichaPratica04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valueP1, valueP2, tentativas = 0;

        System.out.print("[Player1] - Introduza um valor entre 0 e 100: ");
        valueP1 = input.nextInt();

        for (int i = 0; i < 100; i++) { // dá 100 enters para esconder o número do primeiro jogador.
            System.out.println();
        }

        do {
            System.out.print("[Player2] - Adivinhe o valor do player1: ");
            valueP2 = input.nextInt();

            if (valueP2 < valueP1) {
                System.out.println("\n --O valor é inferior ao do Player1-- \n");
            } else if (valueP2 > valueP1) {
                System.out.println("\n --O valor é superior ao do Player1-- \n");
            }else{
                System.out.println("\n --Parabéns, acertou no valor!--");
            }
            tentativas++;

        } while (valueP2 != valueP1);

        System.out.println("Número de tentativas: " + tentativas);
    }
}
