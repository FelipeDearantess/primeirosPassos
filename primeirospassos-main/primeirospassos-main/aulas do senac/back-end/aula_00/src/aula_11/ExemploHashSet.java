package aula_11;

import java.util.*;

public class ExemploHashSet {
    public static void main(String[] args) {
        //Criando um set com o HashSet

        Set<String> alunos = new HashSet<>();
        //Adicionando elementos

        alunos.add("João");
        alunos.add("Maria");
        alunos.add("Carlos");

        System.out.println(alunos);

    // Tentando adicionar um elemento duplicado
        alunos.add("Maria");
        System.err.println(alunos);

        
    }
    
}
