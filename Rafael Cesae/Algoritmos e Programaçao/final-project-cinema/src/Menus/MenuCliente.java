package Menus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCliente {
    public static void menuCliente(){
        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("=========== CLIENTE =========== \n");

            System.out.println("1 - Novo registo");
            System.out.println("2 - Consultar cartaz cinematográfico");
            System.out.println("3 - Pesquisar filmes");
            System.out.println("4 - Visualizar mapa de uma sala");
            System.out.println("5 - Reservar bilhetes");
            System.out.println("6 - Recomendar filmes");
            System.out.println("7 - Quiz cinematográfico");
            System.out.println("0 - VOLTAR\n");

            System.out.println("================================== ");


            try {
                System.out.println("=== Escolha a opção pretendida ===");
                opcao = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("=== Valor inválido. Introduza um número para selecionar a sua opção ===\n");
                opcao = -1;
                input.nextLine(); //Limpar o buffer
            }


            switch (opcao) {
                case 1:
                    //Novo registo
                    break;
                case 2:
                    //Consultar cartaz cinematográfico
                    break;
                case 3:
                    //Pesquisar filmes
                    break;
                case 4:
                    //Visualizar mapa de uma sala
                    break;
                case 5:
                    //Reservar bilhetes
                    break;
                case 6:
                    //Recomendar filmes
                    break;
                case 7:
                    //Quiz cinematográfico
                    break;
                case 0:
                    System.out.println("Aguarde um momento ...\n");
                    break;
                case -1:
                    break;
                default:
                    System.out.println("=== Opção Inválida ===\n");
            }
        } while (opcao != 0);
    }
}
