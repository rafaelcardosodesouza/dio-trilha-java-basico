package entities;

/**
 * A classe BankAccount representa uma conta bancária e suas informações associadas.
 * Ela é utilizada para coletar informações necessárias para a abertura de uma conta.
 *
 * <h3>Coleta de informações para abertura da conta:</h3>
 * Como os bancos não têm apenas um cliente, foi dada preferência à abordagem orientada a objetos,
 * eliminando a necessidade de criar várias variáveis.
 *
 * <h3>Atributos:</h3>
 * <p>number: Número da conta do cliente.</p>
 * <p>agency: Número da agência associada à conta.</p>
 * <p>name: Nome do titular da conta.</p>
 * <p>balance: Saldo de abertura da conta em moeda corrente.</p>
 */
public class BankAccount {

    public int number;
    public String agency;
    public String name;
    public double balance;

    /**
     * Retorna uma mensagem personalizada de boas-vindas ao cliente.
     * A mensagem inclui detalhes como nome, agência, número da conta e saldo.
     *
     * @return Mensagem de boas-vindas personalizada.
     */
    public String client() {
        return "\nOlá " + name + " obrigado por criar uma conta em nosso banco,\nsua agência é " + agency + ", conta " + number + " e seu saldo R$ " + balance + " já está disponível para saque!\n";
    }

}
