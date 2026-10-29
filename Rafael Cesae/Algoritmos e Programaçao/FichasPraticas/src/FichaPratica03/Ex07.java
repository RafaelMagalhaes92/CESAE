package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 1, somatorio = 0;

        while(num1 <= 100) {
            System.out.println(num1);
            somatorio = somatorio + num1;
            num1 = num1 + 1;

        }
        System.out.println("Somatório: " + somatorio);
    }
}
