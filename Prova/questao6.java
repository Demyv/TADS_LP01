package Prova;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float notaT, notaE, xp;
        boolean passouT, passouE, muitoxp;

        System.out.println("Digite o valor da sua prova técnica");
        notaT = sc.nextFloat();

        System.out.println("Digite a nota da entrevista");
        notaE = sc.nextFloat();

        System.out.println("Digite os anos de XP:");
        xp = sc.nextFloat();

        passouT = notaT >= 7;
        passouE = notaE >=6;
        muitoxp = xp >=2;


        //System.out.println("Sua nota Técnica é " + notaT);
        //System.out.println("Sua nota da Entrevista  é " + notaE);
        //System.out.println("Seu tempo de experiência é " + xp + " E Você foi APROVADO");
        //System.out.println("Cadastro de reserva");

        boolean aprovadoGeral = passouT && passouE && muitoxp;
        boolean cadastroReserva = passouT && passouE && !muitoxp;

        // Mostramos os resultados calculados pelo computador:
        System.out.println("Sua nota Técnica é " + notaT);
        System.out.println("Sua nota da Entrevista é " + notaE);
        System.out.println("Seu tempo de experiência é " + xp + " anos");
        
        System.out.println("Aprovado: " + aprovadoGeral);
        System.out.println("Cadastro Reserva: " + cadastroReserva);


    }
}
