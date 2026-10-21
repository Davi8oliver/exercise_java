/**
 * Autor: Davi Lopes
 * Descrição: Programa para solicitar ao usuário a medida do lado de um quadrado,
 *            calcular a sua área utilizando a fórmula lado * lado e exibir o resultado formatado no console.
 */

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado;

        System.out.println("===================================================");

        System.out.print("\nDigite a medida do lado do quadrado: ");
        lado = scanner.nextInt();

        System.out.printf("\nA área do quadrado de lado %d é : %d\n\n", lado, (lado * lado));

        System.out.println("===================================================");
    }

}
