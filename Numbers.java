import java.util.Scanner;

public class Numbers {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Integer num1 = 0;
        Integer num2 = 0;
        float total = 0;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        total = (float) num1 / num2;

        IO.println("==================");

        IO.println(num1 + ", " + num2);
        IO.println("" + num1 + num2);
        IO.println("Soma:" + (num1 + num2));
        IO.println("Subtração:" + (num1 - num2));
        IO.println("Multiplicação:" + (num1 * num2));
        IO.println("Divisão:" + (num1 / num2));
        IO.println("Divisão:" + total);

        IO.println("==================");

    }

}
