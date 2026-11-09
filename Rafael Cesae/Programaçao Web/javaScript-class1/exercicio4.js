//Mostrar os numeros de 0 a 10, a soma dos pares e a soma dos impares nesse intervalo

let somaPar = 0;
let somaImpar = 0;

for(i = 0; i <= 10; i++){
    console.log(i)
    if(i % 2 == 0) {
        somaPar += i;
    } else if(i % 2 != 0) {
        somaImpar += i;
    }
}
console.log("Soma dos pares: " + somaPar);
console.log("Soma dos pares: " + somaImpar);