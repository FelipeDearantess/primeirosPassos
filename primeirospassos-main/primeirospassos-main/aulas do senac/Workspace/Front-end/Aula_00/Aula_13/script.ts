// String , number , boolean, null.
// let nomeAluno:string = "william";
// let idadeUsuario: number = 32;
// let notaUsuario: number = 9.8;
// let aprovado: boolean = true;

// //Uma estrutura condicional onde precisa saber se o usuario e maior de idade.
// let idadeUsuario2:number =18;

// if (idadeUsuario2 >=18){
//     console.log("Você e maior de idade.");
// }else{
//     console.log("Você e menor de idade.");
        
// }
// var status3 = idadeUsuario2>=18 ? "você e maior de idade" : "você e menor de idade.";

// //tipo any
// let emailUsuario:any;
// emailUsuario = true;

// let qualquerCoisa:any;

//  let saboresPizza = ["calabresa","mussarela", "marguerita"];
//  let saboresPizza2:string[] = ["calabresa","mussarela", "marguerita"];

//  let saboresPizza3: Array<string>=["banana"];

// function calcular2(preco:number,quantidade:number) : String{
//     var exemplo = preco * quantidade;
//     return`eu sou um exemplo ${exemplo}`
// }    // parâmetros
// console.log(calcular2(10,25));

class Pessoa{
    nome:String;
    idade:Number;
 
    constructor(nome:String, idade:Number){
     this.nome = nome;
     this.idade = idade;
    }
 
    apresentar():string{
        return` ola, meu nome e ${this.nome} e eu tenho ${this.idade} anos.`;
    }
}

//criando uma classe Aluno (herança)

class Aluno extends Pessoa{
    matricula:string;
    curso:string;

    constructor(nome:string,idade:number,matricula:string, curso:string){
        super(nome,idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    mostrarCurso():string{
        return`${this.nome} esta matriculado no curso de ${this.curso}.`
    }
}

//Instanciando um objto da classe pessoa 
let pessoa1 = new Pessoa("carlos",32);
console.log(pessoa1.apresentar());

//Instanciando um objto da classe Aluno

let Aluno1 = new Aluno ("joão",15,"2024123","matematica");
console.log(Aluno1.mostrarCurso());
