//---------------- Verificação Par/Impar com função -----------------//

const numero = parseInt(prompt("Insira um número: "));
function ehPar(numero) {
    if (numero % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

if(ehPar(numero)) {
    console.log("O número " + numero + " é par.")
} else {
     console.log("O número " + numero + " é impar.")
}

//---------------- Calcular desconto com função ----------------//

//Função com apenas o que é preciso para calcular o valor do desconto
function calcularDesconto(preco, percentagem) { 
    return preco * (percentagem/100);
}

//Pedir o preço ao ultilizador
const preco = prompt("Insira um preço: ");
const percentagem = prompt("Insira uma percentagem: ");

//Calcular o preço usando a função
const precoFinal = preco - calcularDesconto(preco,percentagem);

//Apresenta o preço
console.log("O preço a pagar é: " + precoFinal);