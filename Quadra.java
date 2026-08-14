// DADO AS DIMENSOES DE UMA QUADRA RETANGULAR, LARGURA E ALTURA
// CALCULAR A AREA E O PERIMETRO DESTA QUADRA.
// COM QUANTOS PEDAÇOS CONSIGO PREENCHER TODA A QUADRA COM GRAMA E POR QUAL VALOR É VENDIDA ESSE PEDAÇO

import java.util.Scanner;
public class Quadra {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        float largura, altura, base, perimetro,tamanho, grama, preco, n, quantidade, valor;
        System.out.println("Digite a largura da sua quadra:");
        largura = sc.nextFloat();
        
        System.out.println("Digite a altura da sua quadra:");
        altura = sc.nextFloat();
       
        base = altura * largura;
        perimetro = 2 * (largura+altura);
        
        System.out.println("O tamanho da sua quadra é:" + base);
        System.out.println("O tamanho do seu perimetro é:" + perimetro);


        System.out.println("-----------------------");

        // SEGUNDA PARTE  - GRAMA:

        System.out.println("Qual o tamanho da espaço que você quer cobrir com grama: ");
        grama = sc.nextFloat();
        
        tamanho = grama * grama;
        quantGrama  = base/grama;
        
        System.out.println("Qual o valor que pagará: ");
        preco = sc.nextFloat();
     
        quantidade = base/tamanho;
        valor = quantidade * preco;

        System.out.println("O valor que você pagará por:" +  tamanho +  "Será de R$:" + valor);





     

       





        
    
    }
}