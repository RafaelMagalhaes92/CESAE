package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int number1 = input.nextInt();
        System.out.print("Insira outro numero: ");
        int number2 = input.nextInt();

        if (number1 < number2) {
            System.out.println("Maior:" + number2);
        } else {
            System.out.println("Maior:" + number1);
        }
    }
}
