package aula_10.Polimorfismo;

public abstract class Pessoa {


    private String nome;
    private String codigo;



    public Pessoa(){}

    public Pessoa (String nome ){
        this.nome = nome;
    }
   
    public Pessoa(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }


    

    public double somar (double numero){
        return numero+ 2;
    }

    public double somar(double numero, double numero2){
        return numero + numero2;
    }
    

    public double somar(double numero, double numero2, double numero3){
        return numero + numero2 + numero3;
    }



    public void fazerAtividade(){
        System.out.println("A pessoa está realizando uma atividade.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
