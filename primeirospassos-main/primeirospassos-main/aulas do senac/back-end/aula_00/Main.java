package aula_00;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

       String nomeUsuario = "Felipe" ;
       int idadeUsuario = 22;
       double alturaUsuario = 1.82;
       boolean falaIngles = true;
       char conceitoProva = 'A';
       System.out.println("Hello World");
       System.out.print("Hello World");
       System.out.printf("o nome do usuario e " + nomeUsuario + ", a idade dele e : " + idadeUsuario + " e ele tem alura de : " + alturaUsuario + " ele fala ingles " + falaIngles);
       System.out.printf(" O nome do usuario e %s, a idade dele e : %d e ele tem altura de : %.2f. ele fala ingles? %b", nomeUsuario,idadeUsuario,alturaUsuario,falaIngles);
    }    
}