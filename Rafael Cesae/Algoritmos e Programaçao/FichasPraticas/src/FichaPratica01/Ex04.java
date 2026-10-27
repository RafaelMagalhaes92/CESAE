package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double raio, area, raioQuadr;

        System.out.print("Indique o valor do raio da circunferencia: ");
        raio = input.nextDouble();


        raioQuadr = raio * raio;
        area = pi * raioQuadr;

        System.out.println("A area da circunferencia é: " + area);


    }
}
