package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdInserida, numeroAnterior, numeroAtual, verificacao;

        System.out.print("Quantos números deseja inserir: ");
        qtdInserida = input.nextInt();

        verificacao = qtdInserida;

        System.out.print("Introduza um número: ");
        numeroAnterior = input.nextInt();

        while (qtdInserida > 1) {
            System.out.print("Introduza um número: ");
            numeroAtual = input.nextInt();
            qtdInserida--;
            if (numeroAnterior < numeroAtual) {
                verificacao--;
            }
            numeroAnterior = numeroAtual;
        }
        if (qtdInserida == verificacao) {
            System.out.println("Crescente");
        } else {
            System.out.println("Nao Crescente");
        }
    }
}
