const limiteSaques = 3;
let saldo = 0;
let extrato = "";
let limite = 500;
let numeroSaque = 0;

while(true) {
        menu = prompt(`
        ============================
        [d] - Depósito
        [s] - Saque
        [e] - Extrato
        [q] - Sair
        ============================
        `);

        if(menu == "d") {
            valor = parseFloat(prompt("informe o valor do deposito: R$"));
            if (valor > 0 ){
                saldo += valor
                extrato += `deposito de R$ ${valor} \n`
                console.log(`deposito de R$ ${valor} realizado`);
            }else {
                console.log(" Operação falhouu! o valor informado e invalido");
            }
        } 
        else if(menu == "s") {
            valor = parseFloat(prompt("Informe o valor do saque: R$")); 
            excedeuSaldo = valor > saldo;
            excedeuLimite = valor > limite;
            excedeuSaque = numeroSaques >= limiteSaques;
            if(excedeuSaldo) {
                console.log("Operação falhou! Você não tem saldo suficiente!");
            } else if(excedeuLimite) {
                console.log("Operação falhou! O valor do saque excede o limite!");
            } else if(excedeuSaque) {
                console.log("Operação falhou! Número máximo de saques excedido!");
            } else if(valor > 0) {
                saldo -= valor;
                extrato += `Saque de R$${valor} \n`;
                console.log(`Saque de R$${valor} relizado`);
                numeroSaques++; // numeroSaques = numeroSaques + 1;
            }
        }
      
        else if(menu == "e") {

        }
        else if(menu == "q"){
            console.log("obrigado pela preferência!!");
            bre
        }
        else {  
            console.log("Opção invalida, por favor selecione novamente a operação desejada.");
        }

}

// 3 operações: depósito

// 1. Deve ser possível depositar valores positivos. 
// 2.Todos os depósitos devem ser armazenados em uma variável e exibidos na operação de extrato.

// Operação de saque


// 1.O sistema deve permitir realizar 3 saques diários com limite máximo de R$ 500,00 por saque.
// 2. Caso o usuário não tenha saldo em conta, o sistema deve exibir uma mensagem informando que não será possível sacar o dinheiro por falta de saldo.
// 3. Todos os saques devem ser armazenados em uma variável e exibidos na operação de extrato.

// Operação de extrato





// 1.Essa operação deve listar todos os depósitos e saques realizados na conta. 
// 2.No fim da listagem deve ser exibido o saldo atual da conta.
// 3. Se o extrato estiver em branco, exibir a mensagem: Não foram realizadas movimentações. 
// 4.Os valores devem ser exibidos utilizando o formato R$ xxx.xx, exemplo: 
