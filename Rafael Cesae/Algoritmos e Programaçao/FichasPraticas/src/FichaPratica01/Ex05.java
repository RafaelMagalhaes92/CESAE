package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaAritmetica, quantValores, mediaPonderada;

        System.out.print("Introduza a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Introduza a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Introduza a terceira nota: ");
        nota3 = input.nextDouble();

        System.out.print("Introduza a quantidade de valores: ");
        quantValores = input.nextInt();

        mediaAritmetica = (nota1 + nota2 + nota3) / quantValores;
        System.out.println("A média aritmética é: " + mediaAritmetica);

        mediaPonderada = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);
        System.out.println("A média ponderada é: " + mediaPonderada);


    }
}
