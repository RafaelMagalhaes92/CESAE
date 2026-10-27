package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();
        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("O menor dos três números é: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("O menor dos três números é: " + num2);
        } else {
            System.out.println("O menor dos três números é: " + num3);
        }
    }
}
