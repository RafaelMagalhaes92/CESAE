package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, par = 2;

        System.out.print("Introduza um numero: ");
        numero = input.nextInt(); // exemplo - 12

        // imprimir os numeros pares de 2 ao numero escolhido inclusive
        while(par <= numero) {
            System.out.println(par);
            par = par + 2;
        }
    }
}
