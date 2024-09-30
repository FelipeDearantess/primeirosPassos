package aula_10.estrutura_de_dados;

import java.util.LinkedList;

import java.util.*;
public class ExemplolinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numeros =new LinkedList<>();

        numeros.addFirst(10);
        numeros.addLast(20);
        numeros.add(30);

        System.out.println(numeros);

        System.out.println("Primeiro: " + numeros.getFirst() );
        System.err.println("Ultimo: " + numeros.getLast ());

        numeros.removeFirst();

        System.out.println("Lista após a remoção: " + numeros );
    }
}
