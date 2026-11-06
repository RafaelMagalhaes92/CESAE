package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] vetor = new int[10];

        //vetor.length lê o tamanho do array para nao estarmos sempre a ajustar a leitura de valores.

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira um valor: ");
            vetor [i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]" + vetor[i]);
        }
    }
}
