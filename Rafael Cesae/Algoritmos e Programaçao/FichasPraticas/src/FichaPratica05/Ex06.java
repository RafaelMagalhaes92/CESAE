package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int[5];
        boolean crescente = true;


        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um valor no array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length -1; i++) {

            if (array[i] >= array[i + 1] ){
                crescente = false;
                // Deixa de ser crescente
            }
        }
        if (crescente) {
            System.out.println("É crescente");
        } else {
            System.out.println("Não é crescente");
        }
    }
}
