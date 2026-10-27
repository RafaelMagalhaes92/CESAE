package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double taxa, salary;

        System.out.print("Introduza um salario: ");
        salary = input.nextDouble();

        if(salary <= 15000) {
            taxa = salary * 0.2;
            System.out.println("Paga taxa de 20%: " + taxa);
        } else {
            taxa = salary * 0.3;
            System.out.println("Paga taxa de 30%: " + taxa);
        }
    }
}
