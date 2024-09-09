import java.util.*;

public class App {
    public static void main(String[] args) {
        String produto1 ="Computador";
        String produto2 = "Mesa de escritorio";

        byte idade = 30;
        int codigo =5290;
        char genero = 'F';
        
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        
        System.out.printf("%s o preço e de %.2f  mesa de %s, o preço e de %.2f regitro %d codigo %d e genero %s medida com oito casas apos a virgula: %.8f medida arredondada com três casas apos a virgula:%3f medida com ponto flutuante padrão us:" 
        ,produto1, preco1, produto2,preco2,idade,codigo, genero, medida, medida, medida );
        Locale.setDefault(Locale.US);
        
        System.out.printf("medida com ponto flutuantes padrão us %.3f", medida);
    }
}

