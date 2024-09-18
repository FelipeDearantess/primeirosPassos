package aula_06;

public class Aluno {
    int id;
    String nome;
    String dataNascimento;
    char sexo;
    String endereco;
    String telefone;
    boolean status = true;

    void inativo(){
        if (status ==true){
            status = false;
            System.out.println("Aluno não Matriculado.");
        
        }
    }

    void ativo(){
    if (status ==false){
        status = true;
        System.out.println("Aluno Matriculado.");
        }
    }
}
