package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0, limite;

        System.out.print("Introduza um número: ");
        limite = input.nextInt();

        while(limite >= numero) {
            System.out.println(numero);
            numero = numero + 1;
        }
    }
}
