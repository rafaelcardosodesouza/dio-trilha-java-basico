package intites;

public class BankAccount {
    public int number;
    public String agency;
    public String name;
    public double balance;


    public String client(){
        return "Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque";
    }

}
