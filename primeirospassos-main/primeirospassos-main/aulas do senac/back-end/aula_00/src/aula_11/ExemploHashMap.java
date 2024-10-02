package aula_11;

import java.util.*;

public class ExemploHashMap {
    public static void main(String[] args) {
        
        //Criando um HashMap

        Map<String, Integer> notasAlunos = new HashMap<>();

        //Adicionando pares chave-valor

        notasAlunos.put("joão", 85);
        notasAlunos.put("Maria", 92);
        notasAlunos.put("Carlos", 75);
        System.out.println(notasAlunos);

        //Acessando o valor associado a uma chave
        
        System.out.println("Nota da Maria " + notasAlunos.get("Maria"));

        //Removendo um par

        System.out.println(notasAlunos.remove("Carlos"));
        System.out.println(notasAlunos);

        //Tentando adicionar uma chave repetida

        notasAlunos.put("Maria", 90);
        System.out.println(notasAlunos);

    }
}
