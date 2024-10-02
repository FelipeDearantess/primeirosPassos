package aula_11;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {


        //Criando uma fila de inteiros

        Queue<Integer> fila = new LinkedList<>();

        //Adicionando elementos da fila 

        fila.offer(10);
        fila.offer(20);
        fila.offer(30);

        System.err.println(fila);

        //Acessando o primeiro elemento

        System.out.println("Primeiro da fila: " + fila.peek());
        System.err.println(fila);
        //Remover o primeiro elemento da fila 

        System.out.println("Elemento removido: " + fila.poll());
        System.err.println(fila);
    }
}
