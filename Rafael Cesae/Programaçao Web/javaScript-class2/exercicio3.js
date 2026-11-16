//-----------------------Relacionar os elementos do html com o js-----------------------//

const taskForm = document.getElementById("taskForm");
const taskInput = document.getElementById("taskInput");
const taskList = document.getElementById("taskList");

//-----------------------Comportamento do form-----------------------//

taskForm.addEventListener("submit", (event) => { // criamos uma funçao para o taskForm
    event.preventDefault();
    const taskText = taskInput.value.trim(); // trim remove todos os espaços da messagem
    if (taskText === "") return; // compara se a mensagem é exatamente igual a nada caso so seja inserido espaços, se sim, nao faz nada
    const taskItem = document.createElement("li"); // criamos uma variavel para adicionar elementos lista
    const taskLabel = document.createElement("span"); // criamos uma variavel para adicionar mensagem
    taskLabel.textContent = taskText; // Associamos o nosso label ao taskText que é o imput do user
    const removeButton = document.createElement("button"); // criamos uma variavel para adicionar um button que vai remover algo
    removeButton.type = "button" // Associamos a nossa variavel ao tipo button para se tornar um botao
    removeButton.textContent = "Remover" // Adiciona-mos o nome Remover ao nosso botão
    removeButton.addEventListener("click", () => taskItem.remove()); // Adiciona-mos a habilidade de click com a funçao de remover o elemento
    taskItem.append(taskLabel, removeButton); // Adiciona ao nosso item("li") o label(mensagem inserida) + o botao de remover
    taskList.append(taskItem); // Adiciona há nossa lista o nosso item
    taskInput.value = ""; // No final limpa o nosso campo de mensagem
});