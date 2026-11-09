const nota = prompt("Insira o valor da nota: "); // o prompt mostra uma mensagem ao usuário

if(nota >= 0 && nota <= 9) {
    console.log("Nao aprovado")
    alert("Nao aprovado") // o alert mostra um alerta com a mensagem inserida
} else if (nota >= 10 && nota <= 13) {
    console.log("Suficiente")
    alert("Suficiente")
} else if (nota >= 14 && nota <= 17) {
    console.log("Bom")
    alert("Bom")
} else if (nota >= 18 && nota <= 20) {
    console.log("Muito bom")
    alert("Muito bom")
} else {
    console.log("Valor da nota inválido")
    alert("Valor da nota inválido")
}