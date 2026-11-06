package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int valorMaior;


        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira os valores no array");
            array[i] = input.nextInt();
        }

        // se os numeros forem negativos assim fazemos a camparaçao a partir do valor do primeiro elemento.
        valorMaior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > valorMaior) {
                valorMaior = array[i];
            }
        }

        System.out.println("Maior: " + valorMaior);
    }
}
