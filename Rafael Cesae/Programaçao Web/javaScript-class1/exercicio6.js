
const nome = prompt("Nome do aluno: ");
const nota = parseInt(prompt("Insira a nota do teste: "));
const notaProjeto = parseInt(prompt("Insira a nota do projeto: "));


function mediaFinal (nota, notaProjeto) {
    return (media = (nota + notaProjeto) / 2);
}


if(mediaFinal(nota,notaProjeto) > 10 && mediaFinal(nota,notaProjeto) < 20) {
    console.log(nome + " Média: " + media + " Aprovado.")
} else {
    console.log(nome + " Reprovado.")
}

console.log("Média arredondada: " + Math.floor(media));

const tabuada = Math.floor(media);

for(i=1; i<=10; i++) {
    console.log("Tabuada: " +  tabuada + " x " + i + " = " + (tabuada * i))
}