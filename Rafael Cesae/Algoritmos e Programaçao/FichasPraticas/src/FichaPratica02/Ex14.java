package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();
        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 <= num3 && num3 <= num2) {
            System.out.println(num1 + " " + num3 + " " + num2);
        } else if (num2 <= num1 && num1 <= num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        } else if (num2 <= num3) {
            System.out.println(num2 + " " + num3 + " " + num1);
        } else if (num2 <= num1) { /* Pergunta porque é que aqui temos de verificar 2 <= 1 quando em cima ja se verificou isso */
            System.out.println(num3 + " " + num2 + " " + num1);
        } else {
            System.out.println(num3 + " " + num1 + " " + num2);
        }

    }
}
