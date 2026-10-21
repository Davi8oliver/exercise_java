/**
 * Autor: Davi Lopes
 * Descrição: Programa para coletar o nome e a idade de duas pessoas, comparar as idades
 *            e indicar a diferença de anos entre ambas ou apontar se possuem a mesma idade.
 */

import java.util.Scanner;

public class DiferencaIdade {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int age1, age2;
        String name1, name2;

        System.out.println("=========================================================");

        System.out.println("Digite o nome da primeira pessoa:");
        name1 = scanner.next();

        System.out.println("=========================================================");

        System.out.println("Digite a idade da primeira pessoa:");
        age1 = scanner.nextInt();

        System.out.println("=========================================================");

        System.out.println("Digite o nome da segunda pessoa:");
        name2 = scanner.next();

        System.out.println("=========================================================");

        System.out.println("Digite a idade da segundda pessoa:");
        age2 = scanner.nextInt();

        System.out.println("=========================================================");

        if (age1 > age2){
            System.out.printf("%s tem %d anos de diferênça em relação ao(à) %s\n", name1, age1 - age2, name2);
        } else if (age2 > age1){
            System.out.printf("%s tem %d anos de diferênça em relação ao(à) %s\n", name1, age2 - age1, name2);
        } else {
            System.out.printf("%s e %s tem a mesma idade\n", name1, name2);
        }

        System.out.println("=========================================================");
    }

}
