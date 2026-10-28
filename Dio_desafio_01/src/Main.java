import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Saldo saldo = new Saldo();
        Cheque cheque = new Cheque();
        int opcao, valor;

        System.out.println("\n============================");
        System.out.println("Nova conta!!");
        System.out.println("Quanto você deseja depositar inicialmente?");
        saldo.setSaldo(scanner.nextInt());
        if (saldo.getSaldo() <= 500.0){
            cheque.setCheque(50);
        }else{
            cheque.setCheque(saldo.getSaldo()/2);
        }

        do {
        System.out.println("\n============================");
        System.out.println("SISTEMA DE GESTÃO FINANCEIRA");
        System.out.println("============================");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar se a conta está usando cheque especial");
        System.out.println("7 - Sair\n");

        for (;;) {
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("=====================================");
                    System.out.println("Saldo atual é de: $" + saldo.getSaldo());
                    System.out.println("\n1 - Voltar");
                    opcao = scanner.nextInt();
                    System.out.println("=====================================\n\n\n\n\n");
                }
                case 2 -> {
                    System.out.println("=====================================");
                    System.out.println("Cheque especial atual é de: $" + cheque.getCheque());
                    System.out.println("\n1 - Voltar");
                    opcao = scanner.nextInt();
                    System.out.println("=====================================\n\n\n\n\n");
                }
                case 3 -> {
                    System.out.println("=====================================");
                    do {
                        System.out.println("Quanto você deseja depositar?");
                        valor = scanner.nextInt();
                        System.out.println("Valor digitado: $" + valor);
                        System.out.println("Confirmar?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - não");
                        System.out.println("3 - cancelar");
                        opcao = scanner.nextInt();

                            if (opcao == 1){
                                saldo.setSaldo(saldo.getSaldo() + valor);
                                    System.out.println("Valor depositado");
                                    Thread.sleep(3000);
                                    System.out.println("=====================================\n\n\n\n\n");
                            }else if (opcao == 2){
                                System.out.println("\n\n\n\n\n");
                            }else {
                                Thread.sleep(3000);
                                System.out.println("=====================================\n\n\n\n\n");
                                break;
                            }
                    }while (opcao != 1);
                }
                case 4 -> {
                    System.out.println("=====================================");
                    do {
                        System.out.println("Quanto você deseja sacar?");
                        valor = scanner.nextInt();
                        if (valor > saldo.getSaldo()) {
                            System.out.println("Saldo insuficiente, deseja utilizar o cheque especial?");
                            System.out.println("1 - Sim");
                            System.out.println("2 - não(voltar)");
                            opcao = scanner.nextInt();

                            if (opcao == 1) {
                                if ((valor - saldo.getSaldo()) > cheque.getCheque()) {
                                    System.out.println("saldo e cheque insuficiente");
                                    System.out.println("=====================================\n\n\n\n\n");
                                    Thread.sleep(3000);
                                    break;
                                } else {
                                    cheque.setCheque(cheque.getCheque() - (valor - saldo.getSaldo()));
                                    saldo.setSaldo(0);
                                    saldo.setSaldo(saldo.getSaldo() - (cheque.getCheque() / 5));
                                    System.out.println("Valor subtraido da conta!");
                                    System.out.println("Saldo atual: -$" + saldo.getSaldo());
                                    Thread.sleep(3000);
                                    System.out.println("=====================================\n\n\n\n\n");
                                }
                            } else {
                                System.out.println("=====================================\n\n\n\n\n");
                                Thread.sleep(3000);
                                break;
                            }
                        }else {
                            System.out.println("Valor digitado: $" + valor);
                            System.out.println("Confirmar?");
                            System.out.println("1 - Sim");
                            System.out.println("2 - não");
                            opcao = scanner.nextInt();

                            if (opcao == 1) {
                                saldo.setSaldo(saldo.getSaldo() - valor);
                                System.out.println("Valor subtraido da conta!");
                                System.out.println("Saldo atual: " + saldo.getSaldo());
                                Thread.sleep(3000);
                                System.out.println("=====================================\n\n\n\n\n");
                            }else if (opcao == 2){
                                System.out.println("\n\n\n\n\n");
                            }else {
                                Thread.sleep(3000);
                                System.out.println("=====================================\n\n\n\n\n");
                                break;
                            }
                        }

                    } while (opcao != 1);
                }
                case 5 -> {
                    System.out.println("=====================================");
                    do {
                        System.out.println("Qual o valor do boleto?");
                        valor = scanner.nextInt();
                        if (valor > saldo.getSaldo()) {
                            System.out.println("Saldo insuficiente, deseja utilizar o cheque especial?");
                            System.out.println("1 - Sim");
                            System.out.println("2 - não(voltar)");
                            opcao = scanner.nextInt();

                            if (opcao == 1) {
                                if ((valor - saldo.getSaldo()) > cheque.getCheque()) {
                                    System.out.println("saldo e cheque insuficiente");
                                    System.out.println("=====================================\n\n\n\n\n");
                                    Thread.sleep(3000);
                                    break;
                                } else {
                                    cheque.setCheque(cheque.getCheque() - (valor - saldo.getSaldo()));
                                    saldo.setSaldo(0);
                                    saldo.setSaldo(saldo.getSaldo() - (cheque.getCheque() / 5));
                                    System.out.println("Valor subtraido da conta!");
                                    System.out.println("Saldo atual: -$" + saldo.getSaldo());
                                    Thread.sleep(3000);
                                    System.out.println("=====================================\n\n\n\n\n");
                                }
                            } else {
                                System.out.println("=====================================\n\n\n\n\n");
                                Thread.sleep(3000);
                                break;
                            }
                        }else {
                            System.out.println("Valor digitado: $" + valor);
                            System.out.println("Confirmar?");
                            System.out.println("1 - Sim");
                            System.out.println("2 - não");
                            opcao = scanner.nextInt();

                            if (opcao == 1) {
                                saldo.setSaldo(saldo.getSaldo() - valor);
                                System.out.println("Valor subtraido da conta!");
                                System.out.println("Saldo atual: $" + saldo.getSaldo());
                                Thread.sleep(3000);
                                System.out.println("=====================================\n\n\n\n\n");
                            } else {
                                System.out.println("\n\n\n\n\n");
                            }
                        }

                    } while (opcao != 1);}
                case 6 -> {
                    System.out.println("=====================================");
                    if (saldo.getSaldo() <= 0){
                        System.out.println("Você está usando o cheque especial, seu saldo é de: " + saldo.getSaldo());
                        Thread.sleep(3000);
                        System.out.println("=====================================\n\n\n\n\n");
                    }else {
                        System.out.println("Você não está usando o cheque especial, seu saldo é de: " + saldo.getSaldo());
                        Thread.sleep(3000);
                        System.out.println("=====================================\n\n\n\n\n");
                    }

                }
                case 7 -> System.out.println("Adeus!!");
            }
            break;
        }
        }while (opcao != 7);
    }

}