package FuncionalidadesCliente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PesquisarFilmes {

    /**
     * Função para pesquisar um filme pelo seu género (Ex:. Drama,Animação,Comédia,etc) e ver as suas informações.
     * @throws FileNotFoundException Caso o ficheiro nao exista
     */
    public static void pesquisarFilme () throws FileNotFoundException {
        int cfilmes = 0;

        File ficheiro = new File("GrandeEcraFicheiros/GrandeEcra_Filmes.csv");
        Scanner sc = new Scanner(ficheiro);

        sc.nextLine();

        System.out.println("Género a pesquisar: ");
        Scanner input = new Scanner(System.in);
        String genero = input.nextLine();


        while(sc.hasNextLine()) {
            String linhaAtual = sc.nextLine();
            String[] elementosLinha = linhaAtual.split(";");

            if(genero.equalsIgnoreCase(elementosLinha[2])) {
                cfilmes++;
                System.out.println(elementosLinha[1] + "(" + elementosLinha[4] + ")");
                System.out.println("Realizador                    : " + elementosLinha[3]);
                System.out.println("Duração                       : " + elementosLinha[5] + " min");
                System.out.println("Idade mínima                  : " + elementosLinha[6] + " anos");
                System.out.println("Classificação                 : " + elementosLinha[7] + "/10");
                System.out.println("-------------------------------------------------------");
            }
        }
        if(cfilmes == 0) {
            System.out.println("-------------------------------------------------------");
            System.out.println("\n[ Não foram encontrados filmes para este género :( ]\n");
            System.out.println("-------------------------------------------------------\n");
        }
    }

}
