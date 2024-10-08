package models;


public class Pessoa{
  private  int id;
   private String nome;
   private String cpf;
   private char genero;
   private String data;
   private String email;
   private  String endereco;
   private  String senha;

   
  public Pessoa(String nome, String cpf, char genero, String data, String email, String endereco, String senha) {
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.data = data;
    this.email = email;
    this.endereco = endereco;
    this.senha = senha;
  }


  public int getId() {
    return id;
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


  public char getGenero() {
    return genero;
  }


  public void setGenero(char genero) {
    this.genero = genero;
  }


  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public String getEndereco() {
    return endereco;
  }


  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }


  public String getSenha() {
    return senha;
  }


  public void setSenha(String senha) {
    this.senha = senha;
  }

   
}