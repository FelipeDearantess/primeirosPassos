package aula_04;

import java.util.*;

public class aula_04 {
    
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in); 

        System.out.print("digite a quantidade de números:");
        int n = entrada.nextInt();
        int soma =0;
        
        for (int i = 0;i < n; i++){
            System.out.print("Informe um número:");
            int x = entrada.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
       
        entrada.close();
    }
}






//    String senha = "12345";

//    if (senha.equals("12345")){
//     System.out.println("acesso autorizado");
//    } else {
//     System.out.println("senha incorreta!");





// String nome= "joão";
// int aulas = 4;

// String mensagem = """
//         ola %s!
//         boas vindas ao curso de java.
//         teremos %d aulas para te mostrar o que e preciso para você dar o se primeiro mergulho na linguagem!
//         """.formatted(nome, aulas);
//         System.out.println(mensagem);





//    String mensagem = """
    //            ola mundo!
//            este e um text block.
//            ele permite escreve textos com multiplas linhas
//            sem precisar usar caracteres de escape ou quebras de linhas
//            """;
//            System.out.println(mensagem);
