package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio = 0, limite, incrementadeiro;

        System.out.print("Introduza um limite: ");
        limite = input.nextInt();
        System.out.print("Introduza um salto: ");
        incrementadeiro = input.nextInt();

        while (inicio <= limite) {
            System.out.println(inicio);
            inicio = inicio + incrementadeiro;

        }
    }
}
