package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        int valorMaior;
        //boolean par = true;


        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um valor no array [" + i + "]: ");
            array[i] = input.nextInt();
        }
        valorMaior = -1;

        // se os numeros forem negativos assim fazemos a camparaçao a partir do valor do primeiro elemento.
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                if (valorMaior % 2 != 0) {
                    valorMaior = array[i];
                } else if (array[i] > valorMaior) {
                    valorMaior = array[i]; // 8
                }
            }
        }

        if (valorMaior % 2 == 0) {
            System.out.println("Maior: " + valorMaior);
        } else {
            System.out.println("Não há pares");
        }
    }
}
