/**
 * Autor: Davi Lopes
 * Descrição: Programa para capturar o nome e a idade do usuário e exibir uma mensagem formatada contendo essas informações.
 */

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;


        System.out.println("===================================================");

        System.out.print("Digite seu nome: ");
        name = scanner.next();

        System.out.print("\nDigite sua idade: ");
        age = scanner.nextInt();

        System.out.printf("\nOlá %s, você tem %d anos.\n\n", name, age);
        System.out.println("===================================================");
    }

}
