package FichaPratica06;

public class Ex03 {

    //Função que verifica se o numero recebido é par ou impar
    public static boolean verificacaoPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Função que verifica se um numero recebido é positivo ou negativo
    public static boolean verificacaoPositivo(int numero) {
        if (numero >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificacaoPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Funçao que verifica se um número é perfeito ou não
     * @param numero recebe um número inteiro como argumento
     * @return True se o número for perfeito, False se o número for não perfeito
     */
    public static boolean verficicacaoPerfeito(int numero) {
        int somatorio = 0;
        for (int i = 1; i < numero; i++) {
            if(numero % i == 0){
                somatorio += i;
            }
        }
        if(somatorio == numero){
            return true;
        } else {
            return false;
        }
    }

    public static boolean verificacaoTriangular(int numero){
        int somatorio = 0;
        for (int i = 1; numero > somatorio; i++) {
            somatorio += i;
            if (somatorio == numero) {
                return true;
            }
        }
        return false;
    }
}
