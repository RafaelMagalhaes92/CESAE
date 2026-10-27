package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price1, price2, price3, total, discount;

        System.out.print("Introduza o valor do primeiro produto: ");
        price1 = input.nextDouble();

        System.out.print("Introduza o valor do segundo produto: ");
        price2 = input.nextDouble();

        System.out.print("Introduza o valor do terceiro produto: ");
        price3 = input.nextDouble();

        total = price1 + price2 + price3;
        discount = total / 10;
        total = total - discount;

        System.out.println("Ofereçemos 10% desconto na sua compra, o total a pagar é: " + total);
    }
}
