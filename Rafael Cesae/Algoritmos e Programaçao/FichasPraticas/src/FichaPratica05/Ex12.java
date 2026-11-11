package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[][] matriz = new int[10][2];

        //Pede os valores do primeiro array
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Insira um número no Array1[" + i + "]: ");
            array1[i] = input.nextInt();
        }

        //Pede os valores do segundo array
        for (int j = 0; j < array2.length; j++) {
            System.out.print("Insira um número no Array2[" + j + "]: ");
            array2[j] = input.nextInt();
        }

        //Mostra o resultado pretendido ao percorrer a distancia de um dos arrays e mostrar os valores dos dois usando (i)
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print( array1[i] + " ");
                System.out.print( array2[i] + " ");
            }
            System.out.println();
        }

    }
}
