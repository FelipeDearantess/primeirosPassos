package aula_02;

import java.util.*;

public class Aula_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a primeira letra do seu nome:");
        char letraInicial =entrada.next().charAt(0);
        System.out.println(" A inicial do seu nome é: " + letraInicial);

        // System.out.println("digite a sua altura:");
        // double alturaUsuario = entrada.nextDouble();
        // System.out.printf("sua altura é: %.2f" ,alturaUsuario);

        // System.out.println("digite a sua idade:");

        // int idadeUsuario = entrada.nextInt();
        // System.out.printf("sua idade é: " +idadeUsuario);

        // System.out.println("digite o seu nome:");
        // String nomeUsuario = entrada.nextLine();
        // System.out.println("O seu nome é " + nomeUsuario);

        entrada.close();
    }
}

