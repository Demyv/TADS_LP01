package Prova;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valorT, soma, n100, n50, n20, n10, n5, n2, n1;

        System.out.println("Digite o valor da cedula desejado");
        valor = sc.nextInt();

        valorT = valor / 100;
        soma =  valor % 100;

        System.out.println("Para formar o valor: " + valor +  "com as cedulas de 100 é preciso: " + valorT);

        n50 = soma / 50;
        soma = soma % 50;

        System.out.println("Cédulas de 50: " + n50);

        n20 = soma / 20;
        soma = soma % 20;

        System.out.println("Cédulas de 20: " +n20);

        n10 = soma / 10;
        soma = soma % 10;

        System.out.println("Cédulas de 10 "+n10);
   }
}
