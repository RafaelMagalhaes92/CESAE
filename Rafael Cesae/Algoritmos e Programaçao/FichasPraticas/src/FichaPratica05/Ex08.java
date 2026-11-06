package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Introduza um número: ");
                matriz[i][j] = input.nextInt();

            }
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print( matriz[i][j] + " "); //como é só print os numeros ficam em fila e nao quebra a linha Ex.: [0][0] , [0][1] , [0][3]
            }
            System.out.println(); // quebra a linha quando a matriz for para a proxima linha Ex.: [1][0]
        }
    }
}
