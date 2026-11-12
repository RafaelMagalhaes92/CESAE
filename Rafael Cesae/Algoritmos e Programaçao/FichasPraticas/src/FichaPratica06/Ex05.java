package FichaPratica06;

import java.util.Scanner;

public class Ex05 {
    public static int valorMaior(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static int valorMenor(int[] vetor) {
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    public static boolean vetorCrescente(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] <= vetor[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | ");
        }
    }

    public static int lerTamanhoVetor() {
        Scanner input = new Scanner(System.in);

        int tamanho;

        do {
            System.out.print("Introduza o tamanho do vetor: ");
            tamanho = input.nextInt();

        } while (tamanho <= 0);

        return tamanho;
    }

    public static int[] preencherVetor(int tamanho) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[tamanho];
        int valor;
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Introduza os valores do vetor: ");
            valor = input.nextInt();
            vetor[i] = valor;
        }
        return vetor;
    }
}
