package FuncionalidadesAdmin;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static BiblitecaFuncoes.FuncoesGerais.imprimirFicheiro;

public class ConsultarFicheiros {
    public static void consultarFicheiros() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("=========== CONSULTA DE FICHEIROS =========== \n");

            System.out.println("1 - GrandeEcra_AdminLogin.csv");
            System.out.println("2 - GrandeEcra_Bilhetes.csv");
            System.out.println("3 - GrandeEcra_Cartaz.txt");
            System.out.println("4 - GrandeEcra_Copyright.txt");
            System.out.println("5 - GrandeEcra_Filmes.csv");
            System.out.println("6 - GrandeEcra_Quiz.csv");
            System.out.println("7 - Sala_Mar.csv");
            System.out.println("8 - Sala_Sol.csv");
            System.out.println("9 - Sala_Terra.csv");
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
                    imprimirFicheiro("GrandeEcraFicheiros/GrandeEcra_AdminLogin.csv");
                    System.out.println();
                    break;
                case 2:
                    imprimirFicheiro("GrandeEcraFicheiros/GrandeEcra_Bilhetes.csv");
                    System.out.println();
                    break;
                case 3:
                    imprimirFicheiro("GrandeEcraFicheiros/GrandeEcra_Cartaz.txt");
                    System.out.println();
                    break;
                case 4:
                    imprimirFicheiro("GrandeEcraFicheiros/GrandeEcra_Copyright.txt");
                    System.out.println();
                    break;
                case 5:
                    imprimirFicheiro("GrandeEcraFicheiros/GrandeEcra_Filmes.csv");
                    System.out.println();
                    break;
                case 6:
                    imprimirFicheiro("GrandeEcraFicheiros/GrandeEcra_Quiz.csv");
                    System.out.println();
                    break;
                case 7:
                    imprimirFicheiro("GrandeEcraFicheiros/Sala_Mar.csv");
                    System.out.println();
                    break;
                case 8:
                    imprimirFicheiro("GrandeEcraFicheiros/Sala_Sol.csv");
                    System.out.println();
                    break;
                case 9:
                    imprimirFicheiro("GrandeEcraFicheiros/Sala_Terra.csv");
                    System.out.println();
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

