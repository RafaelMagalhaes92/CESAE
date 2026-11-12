package FichaPratica06;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex02 {

    //Funçao para imprimir uma certa quantidade de "*"
    public static void asterisco(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
    }


    //funçao para verificar se o numero é um valor inteiro positivo
    public static int valorPositivo (int numero){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Introduza um número inteiro positivo: ");
            numero = input.nextInt();
        } while (numero < 0);

        return numero;
    }

    public static void main(String[] args) {
        int numero = 0;

        asterisco(valorPositivo(numero));


    }
}
