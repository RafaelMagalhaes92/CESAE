package FichaPratica04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2;
        String symbol;

        do {
            System.out.print("Introduza um valor: ");
            valor1 = input.nextInt();

            System.out.print("Introduza outro valor: ");
            valor2 = input.nextInt();

            System.out.print("Introduza um simbolo aritmetico ( + - * / ): ");
            symbol = input.next();

            switch (symbol) {
                case "+":
                    System.out.println(valor1 + valor2);
                    break;
                case "-":
                    System.out.println(valor1 - valor2);
                    break;
                case "*":
                    System.out.println(valor1 * valor2);
                    break;
                case "/":
                    System.out.println(valor1 / valor2);
                    break;
                default:
                    System.out.println("Operador inválido");
            }
            System.out.println("Deseja continuar? sim/nao");
            symbol = input.next();
        } while (!symbol.equals("nao"));

    }
}
