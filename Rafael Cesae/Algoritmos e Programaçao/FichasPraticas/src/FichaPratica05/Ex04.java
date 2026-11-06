package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int valorMenor;


        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira os valores no array");
            array[i] = input.nextInt();
        }

        // se os numeros forem negativos assim fazemos a camparaçao a partir do valor do primeiro elemento.
        valorMenor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < valorMenor) {
                valorMenor = array[i];
            }
        }

        System.out.println("Menor: " + valorMenor);
    }
}

