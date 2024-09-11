package aula_03;



public class Aula{
    public static void main(String[] args) {
        int idade =18;
        String status = (idade >= 18 ) ? "adulto" : "Menor";
        System.out.println(status);
    }
}



























// import java.util.Locale;
// import java.util.*;




// public class contadorDeMinutos {
//     public static void main(String[] args) {
//         Locale.setDefault(Locale.US);
//         Scanner entrada = new Scanner(System.in);


//         double taxaBasica = 50.00;
//         int minutos;
         
//         System.out.println("Informe a quantidade de minutos utilizados:");
//         minutos = entrada.nextInt();

//         if (minutos >100){
//             double total = (minutos -100) * 2.0;
            
//             System.out.printf("Valor da conta = %.2f" , (taxaBasica + total));

//         }else{
//             System.out.printf("Valor da conta = %.2f" , taxaBasica );
//         }
//         entrada.close();
//     }
// }
