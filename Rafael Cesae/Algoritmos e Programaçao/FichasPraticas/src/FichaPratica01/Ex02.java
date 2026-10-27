package FichaPratica01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, sum, subtraction, multiplication, div;

        System.out.print("Introduza o primeiro valor: ");
        num1 = input.nextInt();

        System.out.print("Introduza o segundo valor: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        subtraction = num1 - num2;
        multiplication = num1 * num2;
        div = num1 / num2;

        System.out.println("A soma dos valor inseridos é: " + sum);
        System.out.println("A divisão dos valores inseridos é: " + subtraction);
        System.out.println("A multiplicação dos valores inseridos é: " + multiplication);
        System.out.println("A divisão dos valores inseridos é: " + div);

    }
}
