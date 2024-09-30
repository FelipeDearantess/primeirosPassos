package aula_10.estrutura_de_dados;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        
        ArrayList <String> nomes = new ArrayList<>(); 

        nomes.add("joão");
        nomes.add("Maria");
        nomes.add("Carlos");

        System.out.println("Primeiro nome: "  + nomes.get(0));

        nomes.remove("Maria");
        System.out.println("lista após a remoção " + nomes);

        System.err.println("Tamanho da lista: " + nomes.size());

    }
}
