package FuncionalidadesCliente;

import java.io.FileNotFoundException;

import static BiblitecaFuncoes.FuncoesGerais.imprimirFicheiro;

public class ConsultarCartazCine {
    /**
     * Le e imprime integralmente o conteúdo do Cartaz Cinematográfico
     * @throws FileNotFoundException Excepção caso o ficheiro não exista
     */
    public static void consultarCartaz () throws FileNotFoundException {
        System.out.println();
        imprimirFicheiro("GrandeEcraFicheiros/GrandeEcra_Cartaz.txt");
        System.out.println();
    }
}
