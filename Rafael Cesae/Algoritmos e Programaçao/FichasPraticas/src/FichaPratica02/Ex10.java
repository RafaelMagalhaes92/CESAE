package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;
        String sinal;

        System.out.print("Introduza um valor: ");
        num1 = input.nextDouble();
        System.out.print("Introduza um valor: ");
        num2 = input.nextDouble();

        System.out.print("Introduza o sinal da operação aritmetica que deseja realizar: ");
        sinal = input.next();

        switch (sinal) {
            case "+":
                System.out.println("Soma: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Subtraçao: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplicaçao: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Divisao: " + (num1 / num2));
                break;
            default:
                System.out.println("ERROR: OPERADOR INVÁLIDO");

        }
    }
}
