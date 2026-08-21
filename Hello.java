

import java.util.Scanner;

public class Hello {


    static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String nome = "Davi";

        System.out.println("Hello World, what's your name?\n");

        nome = scanner.nextLine();

        System.out.println("\nHello " + nome);


    }

}