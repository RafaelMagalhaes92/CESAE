package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fatorial, valorFinal = 1, inicio = 0;
        System.out.println("Fatorial de: ");
        fatorial = input.nextInt();

        while (fatorial > inicio) {
            valorFinal = valorFinal * (inicio + 1);
            inicio++;
        }
        System.out.println(valorFinal);
    }
}
