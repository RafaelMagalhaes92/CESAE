package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Insira um numero: ");
        numero = input.nextInt();

        for (int i = 1; i < numero ; i++) {
            if(numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}
