package Menus;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static FuncionalidadesAdmin.Autenticacao.autenticacao;
import static Menus.MenuAdmin.menuAdmin;
import static Menus.MenuCliente.menuCliente;

public class MenuInicial {

    public static void menuInicial() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("=========== GRANDE ECRA =========== ");
            System.out.println("Grandes histórias merecem um grande ecrã. \n");

            System.out.println("1 - ADMIN");
            System.out.println("2 - CLIENTE");
            System.out.println("0 - SAIR\n");

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
                    if(autenticacao()){
                        menuAdmin();
                    } else {
                        System.out.println("Credenciais inválidas");
                    }
                    break;
                case 2:
                    menuCliente();
                    break;
                case 0:
                    System.out.println("A Encerrar...");
                    break;
                case -1:
                    break;
                default:
                    System.out.println("=== Opção Inválida ===\n");
            }
        } while (opcao != 0);
    }
}
