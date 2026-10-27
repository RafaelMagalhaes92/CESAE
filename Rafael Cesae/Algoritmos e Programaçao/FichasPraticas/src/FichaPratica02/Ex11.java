package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo, movimento, saldoAtualizado;

        System.out.print("Introduza saldo médio: ");
        saldo = input.nextDouble();

        System.out.print("Introduza valor a movimentar:");
        movimento = input.nextDouble();

        if(movimento <= 0 && -movimento < saldo) {
           saldoAtualizado = saldo + movimento;
            System.out.print("Saldo Atual: " + saldoAtualizado);
        } else if (movimento >= 0){
            saldoAtualizado = saldo + movimento;
            System.out.print("Saldo Atual: " + saldoAtualizado);
        }
        else {
            System.out.println("Saldo Insuficiente.\n Saldo Atual: " + saldo);
        }
    }
}
