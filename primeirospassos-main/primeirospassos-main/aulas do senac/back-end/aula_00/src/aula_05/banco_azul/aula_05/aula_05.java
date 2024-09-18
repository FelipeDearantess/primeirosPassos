package aula_05;


import java.util.*;

public class aula_05 {
     public static void main(String[] args) {
        Scanner entrada  = new Scanner (System.in);
        
        System.out.println("Digite um numeros:");
        int numero = entrada.nextInt();


        int soma =0;

        while (numero !=0) {
        soma = soma + numero;
        
        System.out.println("informe um numero:");
        numero = entrada.nextInt();
        }
        System.out.println(soma);

        entrada.close();
     }
}




// import java.util.*;

// public class aula_05 {
//      public static void main(String[] args) {
//         Scanner entrada  = new Scanner (System.in);
    
//         System.out.println("Digite um numero de 1 a 7:");

        
//         int dia = entrada.nextInt();

//         String nomeDia;
        
//         switch(dia){
//             case 1:
//             nomeDia = "domingo";
//             break;

//             case 2:
//             nomeDia = "segunda-feira";
//             break;

//             case 3:
//             nomeDia = "terça-feira";
//             break;

//             case 4:
//             nomeDia = "quarta-feira";
//             break;

//             case 5:
//             nomeDia = "quinta-feira";
//             break;

//             case 6:
//             nomeDia = "sexta-feira";
//             break;

//             case 7:
//             nomeDia = "sabado";
//             break;

//             default:
//             nomeDia = "dia invalido";
//             break;
//         }
//         System.err.println("o dia " + dia + " é " + nomeDia);

//         entrada.close();
//      }
// }
