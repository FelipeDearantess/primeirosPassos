// se a iade for = maior a 18> maior de idade  
// senão, menor de idade
// if (idade >= 18){
    //     console.log("usuario maior de idade");
    // } else {
        //     console.log("usuario menor de idade");
        // }
// let idade = 19;
// let mensagem = idade >= 18 ? "Usuario maior de idade" : "Usuario menor de";
// console.log(mensagem);

// let pontuacao = parseInt(prompt("digite um numero"));
//  let mensagem = pontuacao >= 1000 ? "Usuario Vip" : "Aumente sua pontuação para se tornar um usuário VIP"
//  document.write(mensagem);

let altura = parseFloat (prompt("digite sua altura:"));
let menor = altura <= 1.20 ? "Acesso apenas para crianças com mais de um metro  vinte": "acesso liberado";
document.write(menor);
