package FichaPratica06;

import java.util.Scanner;

public class Ex07 {
    public static void desenharQuadrado (char letra, int linhas, int colunas){
        for (int i = 1; i < colunas; i++) {
            System.out.print(letra);
            for (int j = 1; j < linhas; j++) {
                if(colunas > 1 && colunas <)
                System.out.println(letra);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letra;
        int linhas, colunas;

        System.out.print("Introduza um caracter: ");
        letra = input.next().charAt(0);

        System.out.print("Introduza o número de linhas: ");
        linhas = input.nextInt();

        System.out.print("Introduza o número de colunas: ");
        colunas = input.nextInt();

        desenharQuadrado(letra, linhas,colunas);
    }
}
