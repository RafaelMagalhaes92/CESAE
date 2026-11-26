package Menus;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static FuncoesAdmin.ConsultarFicheiros.consultarFicheiros;
import static FuncoesAdmin.EstatisticaVendas.estatisticaVendas;
import static FuncoesAdmin.ReceitaPorSala.receitaSala;

public class MenuAdmin {
    public static void menuAdmin() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("=========== ADMIN =========== \n");

            System.out.println("1 - Consultar Ficheiros");
            System.out.println("2 - Estatisticas gerais de vendas");
            System.out.println("3 - Receita por sala");
            System.out.println("4 - Receita por filme");
            System.out.println("5 - Top 3 filmes com maior receita");
            System.out.println("6 - Resetar lotação de uma sala");
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
                    consultarFicheiros();
                    break;
                case 2:
                    estatisticaVendas();
                    break;
                case 3:
                    receitaSala();
                    break;
                case 4:
                    //Receita por filme
                    break;
                case 5:
                    //Top 3 filmes com maior receita
                    break;
                case 6:
                    //Resetar lotação de uma sala
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
