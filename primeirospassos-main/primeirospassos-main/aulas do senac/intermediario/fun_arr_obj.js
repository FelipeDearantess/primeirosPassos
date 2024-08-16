// let sabores = ["mussarela" , "calabresa", "frango com catupiry", "margarita", "portuguesa" ]; //homogeneo
// let dados = ["william", 22 , true, "rua A"]; // heterogeneo
// ## metodos do array 


// let sabores = ["mussarela" , "calabresa", "frango com catupiry", "margarita", "portuguesa" ]; //homogeneo
// let dados = ["william", 22 , true, "rua A"]; // heterogeneo

// push ()
// console.log(sabores);
// sabores.push("Quatro Queijos ");
// console.log(sabores);


// Pop()
// let saiu = sabores.pop();
//  sabores.pop();
//  console.log(sabores);
//  console.log(saiu);

//  shift()
    // sabores.shift();
    // console.log(sabores);

//  unshift()
// sabores.unshift("alho");
// console.log(sabores);

// length - atributo
// console.log(sabores.length);

//-----------------------------------------------------------------------------------------------------------------------------------------------------------
// # function
// A. função sem parametros  --> nada dentro dos ()

// function boasVindas (){
//     console.log("bem vindo a pizzaria sabores!");
// }
// boasVindas();

// B. função com parametros
// -> uma função que calcule o preço total de uma conta com base na quantidade e preço de pizzas consumidas.
// function calcularPreco(preco, quantidade){
//     total = preco * quantidade 
//     return `preço total: R$${total.toFixed(2)}`;
// }
//  console.log (calcularPreco(25,10));
// calcularPreco(25,5);
// calcularPreco(25,12);


// 2. função com retorno de valor


// function calcularPreco(preco, quantidade){
//     //     total = preco * quantidade 
//     //     return `preço total: R$${total.toFixed(2)}`;
//     // }
//     //  console.log (calcularPreco(25,10));
//     // calcularPreco(25,5);
//     // calcularPreco(25,12);
// 3. arrow function

// const calcularPreco = (preco, quantidade) => total = preco * quantidade 
// console.log(calcularPreco(25,10));

const mostrarNome = (nome) => (`seu nome e: ${nome}`);
    
console.log(mostrarNome("Felipe")); 