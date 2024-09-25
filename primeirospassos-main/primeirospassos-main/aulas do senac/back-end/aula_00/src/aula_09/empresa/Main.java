package aula_09.empresa;

public class Main {
    public static void main(String[] args) {
        tecnico tecnico = new tecnico();

      tecnico.setNome("Ana");
      tecnico.setCpf("123456");
      tecnico.setSalario(1500);

      tecnico.emprimirInformacoes();
        
       System.out.println(tecnico.somar());
       System.out.println(tecnico.somar(10.0,20.0));
       System.out.println(tecnico.somar(10.0));
    }
}
