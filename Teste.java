import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int numero, dobro;
        System.out.println("Informe um número:");
        numero = sc.nextInt();
        dobro = numero * 2;
        System.out.println(numero + "x 2 = " + dobro);
           
    }
}
