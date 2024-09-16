package aula_05.banco_azul;

import java.util.*;
import java.util.Locale;



public class projeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Locale.setDefault(Locale.US);


        int limiteSaques =3;
        double saldo =0;
        String extrato = "";
        double limite =500;
        int numeroSaques =0;

        while (true) {
            System.out.println("""
                    
            ============================
            Digite uma opção:
            [d] - Depósito 
            [s] - Saque 
            [e] - Extrato 
            [q] - Sair 
            ============================""");
            
            String menu = entrada.nextLine();
            if (menu.equals("d")){
                System.out.println("Informe o valor do depósito R$ ");
                double valor =  entrada.nextDouble();
                entrada.nextLine();

                if(valor >0){
                    saldo +=valor;
                    // saldo = saldo + valor;
                    extrato += "depósito de R$" + valor + "/n";
                    System.out.println("Depósito de R$ " + valor + "realiado com sucesso /n");
                    System.out.printf("Depósito de R$ %.2f realizado %n " , valor);
                }else{
                    System.out.println("Operação falhou!! o valor informado e invalido");
                }

            }
        }




        entrada.close();
    }
}































































