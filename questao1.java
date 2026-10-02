import java.util.Scanner;

public class questao1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    

    int par = 0;
    while(par!=1){
         System.out.print("Digite o primeiro número: ");
         par = sc.nextInt();
         par = par + 1;
    }
       
    int impar = 0;
    while(impar!=2){
        System.out.print("Digite o segundo número: ");
        impar = sc.nextInt();
        impar = impar + 1;

    }

    int media1, media2;

    media1 = (par + par) / par;
    //media2 = impar/impar;
    

    System.out.println("Sua média 1 é : " + media1);
    //System.out.println("Sua média 2 é : " + media2);
    }

                   

}

        