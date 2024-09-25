package aula_09.empresa;

public  abstract class Funcionario {
        
        private String  nome; 
        private String cpf;
        private double  salario;

public void emprimirInformacoes(){
    System.out.println("o funcionario:" + this.nome + "com cpf:" + this.cpf + "recebe" + this.salario );
}

        
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public double getSalario() {
            return salario;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
       public double somar(){
        return 10.0;
       }

       public double somar(double numero1, double numero2){
        double soma = numero1+ numero2;
        return soma;
       }

       public double somar(double numero){
        double soma= numero*2;
        return soma;
       }
}




