package FichaExtra01;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, peso_na_lua;

        System.out.print("Insira o seu peso: ");
        peso = input.nextInt();

        peso_na_lua = peso * 0.16;

        System.out.print("Peso na lua: " + peso_na_lua + " Kg.");
    }
}
