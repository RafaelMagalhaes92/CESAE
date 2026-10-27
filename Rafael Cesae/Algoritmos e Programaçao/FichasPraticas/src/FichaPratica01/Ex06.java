package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, resultado;

        System.out.print("Introduza um valor: ");
        valor1 = input.nextInt();

        System.out.print("Introduza outro valor: ");
        valor2 = input.nextInt();
        // ____________________________________________

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // ____________________________________________
        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);
    }
}
