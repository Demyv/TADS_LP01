package Prova;


import java.util.Scanner;

public class questao1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float distancia, consumo, litro, qtd_combustivel, valor_viagem;

        System.out.println("Digite quantos Km são necessários para chegar no destino: ");

        distancia = sc.nextFloat();

        System.out.println("Digite o valor do consumo médio");
        consumo = sc.nextFloat();

        System.out.println("Digite o valor do litro do combustível");
        litro = sc.nextFloat();

        qtd_combustivel = distancia / consumo;

        valor_viagem = qtd_combustivel * litro;

        System.out.println("A quantidade estimada de combustível necessária é: " + qtd_combustivel + " e o custo estimado da viagem é de : R$" + valor_viagem);

        System.out.printf("A quantidade estimada de combustível necessária é: %.2f litros e o custo estimado da viagem é de: R$ %.2f\n", qtd_combustivel, valor_viagem);









    

}

}
