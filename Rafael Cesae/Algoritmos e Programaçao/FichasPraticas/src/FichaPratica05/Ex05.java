package FichaPratica05;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int[] array = new int[10];
        int soma = 0, media;


        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um valor no array [" + i + "]: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            soma += array[i];

        }
        media = soma / array.length;
        System.out.println("A média dos valores é: " + media);
    }
}
