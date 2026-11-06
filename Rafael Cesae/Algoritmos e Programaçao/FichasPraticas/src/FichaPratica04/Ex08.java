package FichaPratica04;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, somatorio= 0;
        boolean triangular = false;

        System.out.println("Insira um número: ");
        numero = input.nextInt();

        for (int i = 1; numero > somatorio; i++) {
            somatorio += i;
            if(somatorio == numero) {
                triangular = true;
               // System.out.println(somatorio);
               // System.out.println(numero);
            }
        }

        if(triangular) {
            System.out.println("Triangular");
        } else {
            System.out.println("Nao triangular");
        }
    }
}
