package aula_10.estrutura_de_dados;

public class ExemploArray {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5 };

        System.out.println("primeiro elemento:" + numeros [0]);
        System.out.println("primeiro elemento:" + numeros [4]);

        for (int i =0; i < numeros.length; i++){
            System.out.println("elemento no indice " + i + " :" + numeros[i]);
        }
    }
}
