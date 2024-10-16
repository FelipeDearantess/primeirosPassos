// String , number , boolean, null.
// let nomeAluno:string = "william";
// let idadeUsuario: number = 32;
// let notaUsuario: number = 9.8;
// let aprovado: boolean = true;
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
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
var Pessoa = /** @class */ (function () {
    function Pessoa(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
    Pessoa.prototype.apresentar = function () {
        return " ola, meu nome e ".concat(this.nome, " e eu tenho ").concat(this.idade, " anos.");
    };
    return Pessoa;
}());
//criando uma classe Aluno (herança)
var Aluno = /** @class */ (function (_super) {
    __extends(Aluno, _super);
    function Aluno(nome, idade, matricula, curso) {
        var _this = _super.call(this, nome, idade) || this;
        _this.matricula = matricula;
        _this.curso = curso;
        return _this;
    }
    Aluno.prototype.mostrarCurso = function () {
        return "".concat(this.nome, " esta matriculado no curso de ").concat(this.curso, ".");
    };
    return Aluno;
}(Pessoa));
//Instanciando um objto da classe pessoa 
var pessoa1 = new Pessoa("carlos", 32);
console.log(pessoa1.apresentar());
//Instanciando um objto da classe Aluno
var Aluno1 = new Aluno("joão", 15, "2024123", "matematica");
console.log(Aluno1.mostrarCurso());
