/**
 * Autor: Davi Lopes
 * Origem: Desafio proposto pela DIO (Digital Innovation One)
 * Descrição: Programa para ler o tipo de operação bancária informada pelo usuário,
 *            validar de forma exata se corresponde a DEPOSITO, SAQUE ou TRANSFERENCIA
 *            e imprimir VALID caso seja aceita ou INVALID caso contrário.
 */

import java.util.Scanner;

public class ValidacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operacao = scanner.nextLine();

        boolean operacaoValida = false;

        // A validacao deve ser exata, respeitando maiusculas e minusculas.
        // Compare a entrada com os tres codigos permitidos.

        operacaoValida = operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA");

        // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
        }

}
