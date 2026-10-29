package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0, qtdAdicionados = -1, somatorio = 1, media;

        while (numero != -1) { // o loop ja começa no primeiro sout
            System.out.print("Introduza um número: ");
            numero = input.nextInt();
            somatorio = somatorio + numero;
            qtdAdicionados = qtdAdicionados + 1;
        }

        media = somatorio / qtdAdicionados;
        System.out.print("A média é: " + media);
    }
}
