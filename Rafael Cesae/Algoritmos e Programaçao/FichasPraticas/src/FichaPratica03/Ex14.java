package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdInserida, numeroAnterior = 0, numeroAtual;

        System.out.print("Quantos números deseja inserir: ");
        qtdInserida = input.nextInt();

        System.out.print("Introduza um número: ");
        numeroAnterior = input.nextInt();

        while (qtdInserida > 1) {
            System.out.print("Introduza um número: ");
            numeroAtual = input.nextInt();
            qtdInserida--;

            if(numeroAnterior <0);

            numeroAnterior = numeroAtual;
        }
        System.out.println(numeroAnterior);
    }


}
