import java.util.Scanner;

public class Tabuada {

    public static void main (String[] args){

        Scanner  scanner = new Scanner(System.in);

        int numeroBase;

        System.out.println("Digite qual numero vc quer usar como base: ");
        numeroBase = scanner.nextInt();

        for (int  i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", numeroBase, i, (numeroBase * i));
        }


    }

}
