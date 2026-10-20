import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int lado;

        System.out.println("===================================================");

        System.out.print("\nDigite a medida do lado do quadrado: ");
        lado = scanner.nextInt();

        System.out.printf("\nA área do quadrado de lado %d é : %d\n\n", lado, (lado*lado));

        System.out.println("===================================================");
    }

}
