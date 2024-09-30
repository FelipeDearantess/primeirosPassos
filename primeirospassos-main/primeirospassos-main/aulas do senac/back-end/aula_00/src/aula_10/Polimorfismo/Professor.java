package aula_10.Polimorfismo;

public class Professor extends Pessoa {
    public class professor extends Pessoa{
@Override
        public void fazerAtividade(){
            System.out.println("o professor esta corrigindo a prova.");
        }
    }
}
