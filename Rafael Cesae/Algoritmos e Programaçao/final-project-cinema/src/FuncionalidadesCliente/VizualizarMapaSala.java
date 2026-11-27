package FuncionalidadesCliente;


import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static BiblitecaFuncoes.FuncoesGerais.*;

public class VizualizarMapaSala {

    /**
     * Função para escolher uma das Salas existentes
     * @throws FileNotFoundException caso o ficheiro dos dados da sala nao exista
     */
    public static void escolherSala() throws FileNotFoundException {

        boolean c = false;

        System.out.println("Selecione uma sala:");
        System.out.println("1- Sala Mar");
        System.out.println("2- Sala Terra");
        System.out.println("3- Sala Sol");
        int opcao = 0;

        while(c == false) {
            try {
                Scanner input = new Scanner(System.in);
                opcao = input.nextInt();
                if(opcao >= 1 && opcao <= 3) {
                    c = true;
                } else {
                    System.out.println("Introduza um número inteiro entre 1 e 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduza um número inteiro entre 1 e 3.");
            }
        }



        switch (opcao) {
            case 1:
                visualizarMapa("GrandeEcraFicheiros/Sala_Mar.csv");
                break;
            case 2:
                visualizarMapa("GrandeEcraFicheiros/Sala_Terra.csv");
                break;
            case 3:
                visualizarMapa("GrandeEcraFicheiros/Sala_Sol.csv");
                break;
            default:
                System.out.println("=== Introduza um inteiro de 1 a 3 ===");
        }

    }

    /**
     * Função para visualizar: o mapa de cada sala escolhida, os seus lugares (disponíveis, ocupados e totais) e taxa de ocupação.
     * @param caminho Caminho do ficheiro com a informaçao das salas
     * @throws FileNotFoundException caso o ficheiro nao exista
     */
    public static void visualizarMapa(String caminho) throws FileNotFoundException {
        int lugarDisponivel=0, lugarOcupado=0, lotacao;
        double taxaOcupacao;
        String[][] matriz = lerFicheiroParaMatrizComCabecalho(caminho, ";");
        System.out.print("   ");
        for (int c = 0; c < matriz[0].length; c++) {
            System.out.print("  "+(c + 1));
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            imprimirAlfabeto(i);
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("0")) {
                    lugarDisponivel++;
                    System.out.print(" O ");
                } else if (matriz[i][j].equals("1")) {
                    lugarOcupado++;
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }

        lotacao = lugarDisponivel + lugarOcupado;
        taxaOcupacao = (lugarOcupado*100.0)/lotacao;
        System.out.println("-----------------------------------------------");
        System.out.println(" O - Disponível | X - Ocupado ");
        System.out.println("-----------------------------------------------");
        System.out.println(" Lotação total                : " + lotacao + " lugares");
        System.out.println(" Lugares disponíveis          : " + lugarDisponivel);
        System.out.println(" Lugares ocupados             : " + lugarOcupado);
        System.out.println(" Taxa de ocupação             : " + taxaOcupacao + "%");
        System.out.println("-----------------------------------------------\n");
    }
}
