# estrutura de dados 
## array
-> e um conjunto de dados que armazena uma coleção de elemnetos .
esses elementod podem ser de qualquer tipo.
1. homogeneo
2. heterogeneo
3. array != list em JS

## array 
## criando um array -->
``` javascript 
let dados = ["william", 22 , true, "rua A"]; // homogeneo
let sabores = ["mussarela" , "calabresa", "frango com catupiry", "margarita", "portuguesa" ]; //hoterogeneo
```

## metodos do array 
1. push() -> adiciona um ou mais elementos ao final do array.
``` javascript 
console.log(sabores);
sabores.push("Quatro Queijos ");
console.log(sabores);
```
2. pop() -> remove o ultimo elemnto de um array e retorna ele.
``` javascript
let saiu = sabores.pop();
sabores.pop();
console.log(sabores);
 console.log(saiu);
 ```

3. shift() -> remove o primeiro elemento do array.
``` javascript
 sabores.shift();
console.log(sabores);
 ```

4. unshift() -> adicionar um elemento ou mais no inicio do array.
``` javascript
sabores.unshift("alho");
console.log(sabores);
 ```

5. length () -> e um `atributo`, retorna o tamanho do array
``` javascript
console.log(sabores.length);
```

# function
-> uma função em js, e um bloco de codigo projetado para executar uma tarefa especifica.
 uma função e definida uma vez e pode ser ``invocada`` (chamada )varias vezes, sendo reutilizada.


<!-- # function  -->
<!-- ## criando  funções - parametros argumentos.
 1. função basica
 A. função sem parametros  -->


 2. função com retorno de valor
 ```javascript
 / function calcularPreço(preco, quantidade){
//     total = preco * quantidade 
//     console.log(`preço total: R$ ${total.toFixed(2)}`);
// }
// calcularPreço(25,10);
// calcularPreço(25,5);
// calcularPreço(25,12);
 }
```

3. arrow function 
-> e uma sintaxe mais curta para escrever funções em js.
elas são utilizadas para organizar dados de uma maneira estruturadas.
