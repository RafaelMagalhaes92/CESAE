package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] commisions = new int[12];
        int valor = 0;

        for (int i = 0; i < commisions.length; i++) {
            System.out.println("Insira o valor das suas comissoes: ");
            commisions[i] = input.nextInt();
            valor += commisions[i];
        }
        System.out.println("Valor total das comissões: " + valor);
    }
}
