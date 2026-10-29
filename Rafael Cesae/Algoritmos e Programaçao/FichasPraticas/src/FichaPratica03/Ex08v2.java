package FichaPratica03;

import java.util.Scanner;

public class Ex08v2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int num1, numBase;

            System.out.print("Introduza um número: ");
            num1 = input.nextInt();

            numBase = num1 - 5;

            while (numBase <= num1 + 5) {
                if (numBase != num1) {
                    System.out.println(numBase);
                }
                numBase ++;
            }
        }
    }

