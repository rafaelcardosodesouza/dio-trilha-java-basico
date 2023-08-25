package application;

import entities.BankAccount;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  @author Rafael Cardoso
 *  @version 1.0
 *  @since  25/08/2023
 * <h1>Desafio de abertura de conta em um banco</h1>
 * <h3>Nome ficticio: DioBank</h3>
 * Um programa para simular a abertura de conta bancária no DioBank.
 * Esse programa permite ao usuário inserir informações necessárias para
 * a abertura de uma conta bancária, como nome do titular, número da agência,
 * número da conta e saldo de depósito inicial.
 * <h3> Tratamento de erro de digitação:</h3>
 * <p>Usei o tratamento de erro para "InputMismatchException" caso seja digitado algo de errado</p>
 * <p>Para nao fechar o programa caso tenha algum erro coloque dentro de um loop para, caso
 * tenha algum erro, o usuario possa escolher se queira ou não continuar, caso escolha que quer
 * o programa voltarar ao inicio</p>
 */
public class ContaTerminal {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;

        System.out.println("\nSeja bem-vindo ao DioBank\nA seguir, serão solicitadas algumas informações para\nabertura da conta.\n");

        System.out.print("Por favor, informe o nome: ");
        account.name = sc.nextLine();

        do {
            try {
                System.out.print("Informe o número da AGÊNCIA: ");
                account.number = sc.nextInt();
                sc.nextLine();  // Consumir a quebra de linha

                System.out.print("Agora, informe o número da CONTA: ");
                account.agency = sc.nextLine();

                System.out.print("Para finalizar, insira o saldo de depósito inicial: ");
                account.balance = sc.nextDouble();

                System.out.print(account.client());
                entradaValida = true; // Faz a validação das entradas para sair do loop
            } catch (InputMismatchException erro) {
                System.out.println("Erro: Valor inválido inserido. Certifique-se de inserir um valor numérico.\n");
                System.out.print("Deseja refazer? (s/n): ");
                sc.nextLine(); // Consumir a quebra de linha

                String opcao = sc.nextLine();

                if (opcao.equalsIgnoreCase("n")) {
                    System.out.print("Finalizando programa.");
                    sc.close();
                    break;
                }
            }
        } while (!entradaValida);

        sc.close();
    }
}
