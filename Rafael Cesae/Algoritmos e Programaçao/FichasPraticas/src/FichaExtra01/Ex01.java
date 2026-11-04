package FichaExtra01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("Introduza a idade: ");
        idade = input.nextInt();

        if(idade >= 18) {
            System.out.print("Maior de idade.");
        } else {
            System.out.print("Menor de idade.");
        }
    }
}
