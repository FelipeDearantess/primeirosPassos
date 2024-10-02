package aula_11;

import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        //Crinando uma pilha de inteiros 

        Stack<Integer> pilha = new Stack<>();

        //Adicionando elementos a pilha 

        pilha.push(1); // Primeiro elemento
        pilha.push(2); // Segundo  elemento
        pilha.push(3); // Terceiro elemento

        System.out.println(pilha);

        //Acessando o topo da pilha 
        System.out.println("topo da pilha: " + pilha.peek());  // Saida :3
        System.out.println(pilha);

        // Removendo elementodo topo da pilha

        System.out.println("Elemento removido: " + pilha.pop()); // Saida:3
        System.out.println(pilha);


    }
}
