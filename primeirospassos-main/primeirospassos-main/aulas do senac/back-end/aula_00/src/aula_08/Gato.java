package aula_08;

public class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
        
    }
   
    
    public void emitirSom(){
        System.out.println("o gato esta miando miauu");
    }
    public void arranhar(){
        System.out.println("o gato esta arranhando.argh");
    }
}
