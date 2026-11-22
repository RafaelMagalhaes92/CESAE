package FichaPratica06;

import java.util.Scanner;

public class Ex07 {
    public static void desenharQuadrado (char letra, int linhas, int colunas){
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= colunas; j++) {
                if(i == 1 || i == linhas) {
                    System.out.print(letra);
                }
                // Usar () na minha segunda condição "||" porque o && tem prioridade,
                // se nao ele iria executar sempre o j == colunas e dar print a mais uma letra do que devido
                if(i > 1 && i < linhas && (j == 1 || j == colunas)){
                    System.out.print(letra);
                }
                if(i > 1 && i < linhas && j > 1 && j < colunas){
                    System.out.print(" ");
                }
            }
            System.out.println();
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
