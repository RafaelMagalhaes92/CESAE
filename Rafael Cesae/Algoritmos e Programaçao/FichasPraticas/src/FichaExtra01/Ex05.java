package FichaExtra01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, palpite;

        System.out.println("Numero aleatório: ");
        numero = input.nextInt();

        System.out.println("Avivinhe o número: ");
        palpite = input.nextInt();

        if(numero > palpite) {
            System.out.println("Adivinhe o número (1 a 100)");
        }
    }
}
