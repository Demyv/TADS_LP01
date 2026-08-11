import java.util.Scanner;

public class Operacoes {
   public static void main(String[] args){
    // OPERAÇÃO DE SOMA
    Scanner sc = new Scanner(System.in);
    int numero1, numero2, soma;
    System.out.println("Informe dois valores");

    numero1 = sc.nextInt();
    numero2 = sc.nextInt();

    soma = numero1 + numero2;

    System.out.println("Soma é:" + soma);


   } 
}
