// EXERCICIO 1
// 1. MOSTRAR O SALDO
// 2. VALOR >0
// 3. RECEBA UM VALOR A SAER SACADO >0
// 4. ENCERRAR O LAÇO

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        float saldo = 0;
        float nsaldo;
        float sacar;
        float saque;

        while (true) {
            System.out.print("""
                    1. Ver saldo
                    2. Depositar
                    3. Sacar
                    4. Sair


                   opcao: """
                   
                );
                opcao = sc.nextInt();

            //System.out.println("Digite o valor do seu saldo depositado: ");
            //nsaldo = sc.nextFloat();
            
             if (opcao == 1){
                System.out.println("Seu saldo atual é: " + saldo);}

             else if (opcao==2){
                System.out.println("Digite o valor do seu saldo depositado: ");
                nsaldo = sc.nextFloat();}

             else if (opcao==3);{
                System.out.println("Digite o valor a ser sacado:");
                saque = sc.nextFloat();
                sacar = (nsaldo - saque);
                System.out.println("Seu saldo sacado: " + sacar);}

             else {
                (opcao==4)}
             
                
            }
        
        
    }
}
