package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        String cresceDecres;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();
        System.out.print("Introduza um número: ");
        num2 = input.nextInt();
        System.out.print("Introduza um número: ");
        num3 = input.nextInt();

        System.out.print("Indique a ordem pela qual quer organizar os números. \n C - crescente \n D - decrescente \n");
        cresceDecres = input.next();

        switch (cresceDecres) {
            case "C":
                if (num1 <= num2 && num2 <= num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else if (num1 <= num3 && num3 <= num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else if (num2 <= num1 && num1 <= num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else if (num2 <= num3) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                } else if (num2 <= num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                } else {
                    System.out.println(num3 + " " + num1 + " " + num2);
                }
                break;
            case "D":
                if (num1 >= num2 && num2 >= num3) {
                    System.out.println(num1 + " " + num2 + " " + num3);
                } else if (num1 >= num3 && num3 >= num2) {
                    System.out.println(num1 + " " + num3 + " " + num2);
                } else if (num2 >= num1 && num1 >= num3) {
                    System.out.println(num2 + " " + num1 + " " + num3);
                } else if (num2 >= num3) {
                    System.out.println(num2 + " " + num3 + " " + num1);
                } else if (num2 >= num1) {
                    System.out.println(num3 + " " + num2 + " " + num1);
                } else {
                    System.out.println(num3 + " " + num1 + " " + num2);
                }
                break;
            default:
                System.out.println("--OPERADOR ÍNVALIDO--");
        }
    }
}
