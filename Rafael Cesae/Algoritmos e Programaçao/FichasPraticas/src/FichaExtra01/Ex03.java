package FichaExtra01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price, discountedPrice;

        System.out.print("Introduza o preço: ");
        price = input.nextDouble();

        if(price > 100) {
            discountedPrice = price - (price * 0.1);
            System.out.print("Preço Final: " + discountedPrice + "(10% de desconto)");

        } else {
            System.out.println("Preço Final: " + price);
        }
    }
}
