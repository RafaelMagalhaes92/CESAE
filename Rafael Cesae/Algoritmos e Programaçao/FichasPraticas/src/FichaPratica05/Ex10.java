package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int pesquisa, contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Insira um número na Matriz[" + i +"][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "      ");
            }
            System.out.println();
        }

        System.out.print("Insira um número para pesquisar: ");
        pesquisa = input.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(pesquisa == matriz[i][j]) {
                    contador++;
                }
            }
        }
        System.out.println("Há " + contador + " posições na matriz com o número " + pesquisa);
    }
}
