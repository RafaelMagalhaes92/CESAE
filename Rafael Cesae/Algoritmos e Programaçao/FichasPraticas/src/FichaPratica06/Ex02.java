package FichaPratica06;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex02 {


    public static void asterisco(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Introduza um número: ");
            numero = input.nextInt();

        } while (numero <= 0);

        asterisco(numero);


    }
}
