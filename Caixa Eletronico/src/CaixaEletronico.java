import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;

        while (true) {
            // Exibe o menu de opções
            System.out.println("======= Caixa Eletrônico =======");
            System.out.println("========  Escolha uma opção: ========");
            System.out.println("========  1 = Consultar  ========");
            System.out.println("========  2 = Depositar  ========");
            System.out.println("========  3 = Sacar      ========");
            System.out.println("========  999 = Sair     ========");

            opcao = scanner.nextInt();

            if (opcao == 999) {
                System.out.println("Obrigado, Volte sempre!");
                break; // Encerra o programa
            }

            switch (opcao) {
                case 1: //Consultar

                    System.out.println("Seu Saldo atual é R$: " + saldo);
                    break;

                case 2: //Depositar

                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Valor de Depósito R$ " + valorDeposito + " Realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 3: //Sacar

                    System.out.print("Digite o valor que queira ser sacado: R$ ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > 0 && valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Valor do Saque de R$ " + valorSaque + " realizado com sucesso!");
                    } else if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Valor inválido, por favor tente novamente.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
