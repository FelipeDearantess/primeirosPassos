package aula_06;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.id = 1;
        a1.nome = "Ana";
        a1.dataNascimento = "23/07/2020";
        a1.endereco = "Queimados";
        a1.telefone = "216548751";



        Aluno a2 = new Aluno();
        a2.id = 2;
        a2.nome = "João";
        a2.dataNascimento = "04/08/2015";
        a2.endereco = "Bangu";
        a2.telefone = "216544751";
        
        System.out.println("Dados do aluno(a): " + a1.nome);
        System.out.println("MATRICULA: " + a1.id);
        System.out.println("NOME: " + a1.nome);
        System.out.println("DATA DE NASCIMENTO: " + a1.dataNascimento);


        System.out.println("Dados do aluno(a): " + a2.nome);
        System.out.println("MATRICULA: " + a2.id);
        System.out.println("NOME: " + a2.nome);
        System.out.println("DATA DE NASCIMENTO: " + a2.dataNascimento);

        a2.inativo();
        a2.ativo();
    }
}
