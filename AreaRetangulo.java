import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int base, altura;

        System.out.println("===================================================");

        System.out.print("\nDigite a medida da base do retangulo: ");
        base = scanner.nextInt();

        System.out.print("\nDigite a medida da altura do retangulo: ");
        altura = scanner.nextInt();

        System.out.printf("\nA área do retangulo de base %d e altura %d, é : %d\n\n", base, altura, (base*altura));

        System.out.println("===================================================");
    }

}
