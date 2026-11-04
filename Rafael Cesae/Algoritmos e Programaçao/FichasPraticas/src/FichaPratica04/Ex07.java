package FichaPratica04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, numDivisoes = 0;

        System.out.println("Insira um valor");
        valor = input.nextInt();

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                numDivisoes++;
            }
        }

        if (numDivisoes > 2) {
            System.out.println("O número não é primo");
        }else{
            System.out.println("O número é primo");
        }
    }
}