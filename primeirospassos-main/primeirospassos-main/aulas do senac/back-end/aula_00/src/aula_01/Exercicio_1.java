package aula_01;

import java.util.*;

public class Exercicio_1 {
    public static void main(String[] args) {
        String produto1 ="Computador";
        String produto2 = "Mesa de escritorio";

        byte idade = 30;
        int codigo =5290;
        char genero = 'F';
        
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        
        System.out.println("produto:");
        System.out.printf("%s, o preço e de R$ %.2f%n" ,produto1,preco1);
        System.out.printf("%s, o preço e de R$ %.2f%n%n" ,produto2,preco2);
        System.out.println();
        System.out.printf("registro: %d anos, codigo %d e genero %c%n%n" ,idade,codigo,genero);
       
        System.out.printf("medida com oito casas após a virgula: %.8f%n", medida);
       
        System.out.printf("medida arrendonda com três casas após a virgula: %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("medida com ponto flutuante padrão US:%.3f%n" ,medida);


    }
}
