package FichaPratica04;

import java.util.Scanner;

public class Ex07v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor;
        boolean primo = true;

        System.out.println("Inira um número: ");
        valor = input.nextInt();

        for (int divisor = 2; divisor < valor; divisor++) {
            if(valor % divisor == 0){
                primo = false;
            }
        }
        if(primo) {
            System.out.println("É primo.");
        } else {
            System.out.println("nao é primo");
        }
    }
}
