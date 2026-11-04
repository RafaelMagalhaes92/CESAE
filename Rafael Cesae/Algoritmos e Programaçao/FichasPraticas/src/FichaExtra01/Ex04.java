package FichaExtra01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letra;

        System.out.print("Insira uma letra do alfabeto em MINÚSCULAS: ");
        letra = input.next();

        switch (letra) {
            case "a":
                System.out.print("--Vogal--");
                break;
            case "e":
                System.out.print("--Vogal--");
                break;
            case "i":
                System.out.print("--Vogal--");
                break;
            case "o":
                System.out.print("--Vogal--");
                break;
            case "u":
                System.out.print("--Vogal--");
                break;
            default:
                System.out.println("--Consoante--");

        }
    }
}
