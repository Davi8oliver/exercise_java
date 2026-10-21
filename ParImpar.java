/**
 * Autor: Davi Lopes
 * Descrição: Programa para receber um intervalo numérico (início e fim), capturar a escolha do usuário
 *            entre pares ou ímpares e percorrer o intervalo listando apenas os valores correspondentes à opção selecionada.
 */

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInicial, numFinal, opcao;

        System.out.println("=========================================================");

        System.out.println("Digite o número inicial: ");
        numInicial = scanner.nextInt();

        System.out.println("=========================================================");

        System.out.println("Digite o número final: ");
        numFinal = scanner.nextInt();

        System.out.println("=========================================================");

        System.out.println("Você deseja números pares ou ímpares?\n1- Par\n2- Ímpar");
        opcao = scanner.nextInt();

        System.out.println("=========================================================");

        if (opcao == 1){
            if (numInicial % 2 == 0) {
                for (int i = numInicial; i <= numFinal; i += 2) {
                    System.out.println(i);
                }
                if (numFinal % 2 != 0){
                    System.out.println(numFinal);
                }
            }else {
                System.out.println(numInicial++);
                for (int i = numInicial; i <= numFinal; i += 2) {
                    System.out.println(i);
                }
                if (numFinal % 2 != 0){
                    System.out.println(numFinal);
                }
            }
        } else if (opcao == 2) {
            if (numInicial % 2 == 0) {
                System.out.println(numInicial++);
                for (int i = numInicial; i <= numFinal; i += 2) {
                    System.out.println(i);
                }
                if (numFinal % 2 == 0){
                    System.out.println(numFinal);
                }
            }else {
                for (int i = numInicial; i <= numFinal; i += 2) {
                    System.out.println(i);
                }
                if (numFinal % 2 == 0){
                    System.out.println(numFinal);
                }
            }
        }else {

            System.out.println("Número Invalido!!");

        }


    }

}
