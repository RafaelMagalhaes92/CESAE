package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.somaNumerosFicheiro;

public class Ex05 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Total: " + somaNumerosFicheiro("FicheirosFicha07/exercicio_05_31.txt"));
        System.out.println("Total: " + somaNumerosFicheiro("FicheirosFicha07/exercicio_05_1999.txt"));
    }
}
