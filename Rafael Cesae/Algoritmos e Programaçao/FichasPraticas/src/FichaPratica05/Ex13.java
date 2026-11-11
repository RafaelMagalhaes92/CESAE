package FichaPratica05;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Insira os valores na matriz");
                matriz[i][j] = input.nextInt();
            }
        }

        int somatorio = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ( i == j) {
                    somatorio += matriz[i][j];
                }
            }
        }
    }

}
