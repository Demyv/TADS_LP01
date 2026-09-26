package LISTA01;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);  

     int n, nA, nS;  

     System.out.print("Digite seu número desejado: ");
     n = sc.nextInt();

     nA = n - 1;
     nS = n + 1;

     System.out.println("O número Atual é: " + n);
     System.out.println("O seu número Anterior é: " + nA);
     System.out.println("seu número Sucessor é: " + nS);

     
     
     
     

    }
}
