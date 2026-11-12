package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.print("Introduza um número: ");
        int numero = input.nextInt();

        do {

            System.out.println("-+-+-+-+-+-+-+-+ Menu +-+-+-+-+-+-+-+-");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.println("0. Sair");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");

            System.out.print("Escolha uma opçâo: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    if(verificacaoPar(numero)){
                        System.out.println(numero + " É Par");
                    } else {
                        System.out.println(numero +" É Ímpar");
                    }
                    break;
                case 2:
                    if(verificacaoPositivo(numero)){
                        System.out.println(numero + " É Positivo");
                    } else {
                        System.out.println(numero + " É Negativo");
                    }
                    break;
                case 3:
                    if(verificacaoPrimo(numero)){
                        System.out.println(numero +" É Primo");
                    } else {
                        System.out.println(numero + " Não é Primo");
                    }
                    break;
                case 4:
                    if(verficicacaoPerfeito(numero)){
                        System.out.println(numero + " É Perfeito");
                    } else {
                        System.out.println(numero + " Não é Perfeito");
                    }
                    break;
                case 5:
                    if(verificacaoTriangular(numero)){
                        System.out.println(numero + " É Triangular");
                    } else {
                        System.out.println(numero + " Não é Triangular");
                    }
                    break;
                case 6:
                    System.out.println("Introduza um novo número");
                    numero = input.nextInt();
                case 0:
                    System.out.println("A Encerrar...");
                    break;
                default:
                    System.out.print("--------- " + opcao + " Opção Inválida ---------");
            }
        } while (opcao != 0);
    }
}

