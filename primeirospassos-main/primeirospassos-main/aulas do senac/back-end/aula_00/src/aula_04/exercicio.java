package aula_04;

import java.util.Locale;
import java.util.*;

public class exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quanto você vendeu no mês:");
        Locale.setDefault(Locale.US);


        double vendas=entrada.nextDouble();
        double meta = 10.000;
        double comissao = 0;


        if (vendas >= meta) {
            comissao = vendas * 0.04;
            System.out.printf("Sua comissão: R$ %.2f", comissao);
        } else if (vendas <= meta ){
            comissao = vendas *0.02;
            System.out.printf("sua comissão: R$%.2f", comissao);
            }
        entrada.close();
    }
    }


// 1.Construir um programa para uma empresa de serviços. O operador irá digitar o salário de um cliente. Se o salário for maior ou igual que R$ 3.000,00, o programa irá escrever na tela “Oferecer Plano Alfa” e, caso seja menor, o programa escreverá “Oferecer Plano Beta”.
// public class exercicio {
//     public static void main(String[] args) {
//         Scanner entrada = new Scanner(System.in);
//         System.out.print("Digite seu salario:");

        
//         double salarioUsualrio =entrada.nextDouble();
//         double salario = 3.000;
        
//         if (salarioUsualrio >= salario) {
            
//             System.out.println("Plano A");
//         }else if (salario <3000)
//         System.out.println("Plano B");
//         else {
//             System.out.print("Digite um valor valido");
//             Locale.setDefault(Locale.US);
//         }
//         entrada.close();
//     }
// }