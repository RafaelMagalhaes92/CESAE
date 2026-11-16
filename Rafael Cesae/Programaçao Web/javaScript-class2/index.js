const nomeAluno =
document.getElementById("studentName"); // inserir o ID que está no html

const nomePagina = 
document.getElementById("pageTitle");

const nameForm =
document.getElementById("nameForm");

const nameInput = 
document.getElementById("nameInput");

const feedbackMessage = 
document.getElementById("feedbackMessage");

//+-+-+-+-+-+-+-+------------------------------+-+-+-+-+-+-+-+-+-+


nomeAluno.textContent = 
"Rafael";

nomePagina.textContent = 
"Lista de alunos"

nameForm.addEventListener("submit", (event) => {
    event.preventDefault();
    feedbackMessage.textContent =
    `Olá, ${nameInput.value}!`; //tambem posso usar "Olá, " + nameInput.value;
});
