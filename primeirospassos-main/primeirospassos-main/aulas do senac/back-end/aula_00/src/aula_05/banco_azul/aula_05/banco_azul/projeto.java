package aula_05.banco_azul;

import java.util.*;
import java.util.Locale;

public class projeto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int limiteSaques = 3;
        double saldo = 0;
        String extrato = "";
        double limite = 500;
        int numeroSaques = 0;

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
            if (menu.equals("d")) {
                System.out.println("Informe o valor do depósito R$ ");
                double valor = entrada.nextDouble();
                entrada.nextLine();

                if (valor > 0) {
                    saldo += valor;
                    // saldo = saldo + valor;
                    extrato += "depósito de R$" + valor + "/n";
                    System.out.println("Depósito de R$ " + valor + "realiado com sucesso /n");
                    System.out.printf("Depósito de R$ %.2f realizado %n ", valor);
                } else {
                    System.out.println("Operação falhou!! o valor informado e invalido");
                }
            }

            else if (menu.equals("s")) {
                System.out.println("Informe o valor do Saque: R$");
                double valor = entrada.nextDouble();
                entrada.nextLine();
                boolean excedeuSaldo = valor > saldo;
                boolean excedeuLimite = valor > limite;
                boolean excedeuSaque = numeroSaques >= limiteSaques;

                if (excedeuSaldo) {
                    System.out.println("Operação falhouu!! você não tem suficiente!");
                } else if (excedeuLimite) {
                    System.out.println("Operação falhoou!! o valor do saque excede o limite!");
                } else if (excedeuSaque) {
                    System.out.println("Operação falhoou!! número máximo de saques excedido!");
                } else if (valor > 0) {
                    saldo -= valor;
                    extrato += "saque de R$" + valor + "/n";
                    numeroSaques += 1;
                    System.out.printf("saque de R$ %.2f realizado %n", valor);
                } else {
                    System.out.println("Operação falhoou!! o valor informado e invalido!");
                }
                } else if (menu.equals("e")){
                    String mensagem = extrato.isEmpty() ? "não foram realizadas movimentações:" : extrato;
                    System.err.println(" ================= E X T R A T O ===================");
                            System.out.println();
                            System.out.printf(" Saldo R$ %.2f %n" , saldo);
            }   else if(menu.equals("q")){
                System.out.println("Obrigado pela preferencia!!!");
                break;
            } else{
                System.out.println("Opção invalida, por favor selecione novamente a operação desejada.");
            }



        }
        entrada.close();

    }
}
