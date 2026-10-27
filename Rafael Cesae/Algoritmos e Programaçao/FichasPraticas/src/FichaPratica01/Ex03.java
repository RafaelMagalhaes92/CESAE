package FichaPratica01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int largura, altura, area, perimetro;

        System.out.print("Insira o valor da largura do rectangulo: ");
        largura = input.nextInt();

        System.out.print("Insira o valor da altura do rectangulo: ");
        altura = input.nextInt();

        area = largura * altura;
        perimetro = largura + largura + altura + altura;

        System.out.println("A area do rectangulo é: " + area);
        System.out.println("A perimetro do rectangulo é: " + perimetro);
    }
}
