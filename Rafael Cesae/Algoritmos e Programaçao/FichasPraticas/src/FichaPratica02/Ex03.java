package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary, taxa;

        System.out.print("Introduza o salário: ");
        salary = input.nextDouble();

        if (salary <= 15000) {
            taxa = salary * 0.2;
            System.out.println("Paga taxa de 20%: " + taxa + "€");
        } else if (salary <= 20000) {
            taxa = salary * 0.3;
            System.out.println("Paga taxa de 30%:" + taxa + "€");
        } else if (salary <= 25000) {
            taxa = salary * 0.35;
            System.out.println("Paga taxa de 35%: " + taxa + "€");
        } else {
            taxa = salary * 0.4;
            System.out.println("Paga taxa de 40%: " + taxa + "€");
        }
    }
}


