package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numBase, numMenos, numMais;

        System.out.print("Introduza um número: ");
        numBase = input.nextInt(); // valor inserido: 20

        numMenos = numBase - 5; //20-5 = 15
        numMais = numBase + 5; //20+5 = 15

        System.out.println(numMais + " " + numMenos); // confirma os valores de numMais e numMenos

        while (numMenos < numBase) { // 15 < 20
            System.out.println(numMenos); // Imprime o valor atual
            numMenos = numMenos + 1; // numMenos = 15 + 1 ate 20
        }

        while (numBase < numMais) { // 20 < 25
            numBase = numBase + 1; // numBase = 20 + 1
            System.out.println(numBase); //Imprime o valor do numBase ja com o primeiro incremento.
        }

    }
}
