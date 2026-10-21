/**
 * Autor: Davi Lopes
 * Descrição: Programa para ler um número inicial e manter um laço de repetição solicitando novos números de teste,
 *            validando se são maiores ou iguais ao inicial e continuando a execução enquanto o número informado for divisível pelo número inicial.
 */

import java.util.Scanner;

public class Divisores {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numInicial, numAtual;

        System.out.println("=========================================================");

        System.out.println("Digite o número inicial:");
        numInicial = scanner.nextInt();

        System.out.println("=========================================================");

        do {

            System.out.println("Digite um número para teste:");
            do {
                numAtual= scanner.nextInt();
            }while (numAtual < numInicial);

            System.out.println("=========================================================");

        } while (numAtual % numInicial == 0);
    }

}
