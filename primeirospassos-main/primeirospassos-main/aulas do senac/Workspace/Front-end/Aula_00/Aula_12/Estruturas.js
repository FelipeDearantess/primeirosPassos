// let saboresPizza = ["calabresa","mussarela", "marguerita"];
// // let contador = 0;
// // while(contador < saboresPizza.length){
// //     console.log(saboresPizza[contador]);
// //     contador++;
//     // ou 
//     //contador = contador + 1;
// // }
// for (let contador = 0; contador < saboresPizza.length;contador++){
//     console.log(saboresPizza[contador]);
// }

// let saboresPizza = ["calabresa","mussarela", "marguerita"];
// saboresPizza.push("Quatro Queijos");
// console.log(saboresPizza);

// let saboresPizza = ["calabresa","mussarela", "marguerita"];
// let saiu = saboresPizza.pop();
// console.log(saiu);


// let saboresPizza = ["calabresa","mussarela", "marguerita"];
// saboresPizza.shift();
// console.log(saboresPizza);

// let saboresPizza = ["calabresa","mussarela", "marguerita"];
// saboresPizza.unshift("frango com requeijão");
// console.log(saboresPizza);

// function boasVindas(){
//     console.log("bem vindo À pizzaria sabores !");
// }
// boasVindas();

// Uma função que calcula o preço total de uma pizza com base no preço e na quantidade 

// function calcular(preço, quantidade){// parâmetros
//     let total = preço * quantidade;
//     console.log(`preço total: R$ ${total.toFixed(2)}`);
// }
// calcular(25,10);//Argumentos.

// function calcular(preço, quantidade){// parâmetros
//     let total = preço * quantidade;
//     return total;    
// }
// console.log(`preço total: R$ ${calcular (25,10).toFixed(2)}`);


function calcular(preço, quantidade){// parâmetros
    let total = preço * quantidade;
    return total;   
}
const calcular = (preco,quantidade) => total = preco * quantidade; 
console.log(calcular(25,10));
