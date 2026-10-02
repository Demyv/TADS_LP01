import java.util.Scanner;


public class questaoT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, media;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        media = (n1+n2) / 2;

        System.out.println("Sua média é: " +  media);
                               


    }
    
}
