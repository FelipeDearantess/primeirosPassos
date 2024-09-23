package aula_08;

public class Cachorro extends Animal {
    
    public Cachorro (String nome , int idade ){
        super(nome, idade);
    }
    
    
    public void emitirSom(){
        System.out.println("o cachorro esta latindo -auau");
    }
    public void abanarRabo(){
        System.out.println("o cachorro esta abanando no rabo :D");
    }
    
}
