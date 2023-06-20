package Interfaces;
import AccountsClass.Account;
import AccountsClass.Transaction;

public interface iAccount {

    public double displayBalance();
    public double withdraw(double saldo);
    public double transfer(Account account, double balance);
    public double deposit(double balance);
    public void addTransaction(Transaction transaction);


}
