package FichaPratica07;

import java.io.FileNotFoundException;

import static FichaPratica07.BibliotecaFicheiros.contarNumeroLinhas;

public class Ex07 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("O ficheiro tem: " + contarNumeroLinhas("FicheirosFicha07/exercicio_07.txt") + " linhas.");
    }
}
