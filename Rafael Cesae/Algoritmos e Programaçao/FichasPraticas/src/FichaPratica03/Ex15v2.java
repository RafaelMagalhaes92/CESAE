package FichaPratica03;

public class Ex15v2 {
    public static void main(String[] args) {
        int valorInicial = 1, resultado = 0, resultadoFinal = 0, fatorial = 5;

        while(fatorial > 1) {
            resultado = resultado + valorInicial + ;

            valorInicial = resultado + fatorial - 1;

            resultadoFinal =  resultadoFinal + valorInicial + resultado;
            
            valorInicial++;
            resultado++;
            fatorial--;

        }
        System.out.println(resultadoFinal);
    }
}
