package aula_08;

public class Main {
    public static void main(String[] args) {

        //criando objeto das subclasses
        Cachorro cachorro = new Cachorro("rex", 05);
        Gato gato =new Gato("Miu", 3);

        System.out.println(cachorro.getNome() + "tem" + cachorro.getIdade() + "anos.");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        
        System.out.println(gato.getNome() + "tem" + gato.getIdade() + "anos.");
        gato.emitirSom();
        gato.arranhar();

    }
}
