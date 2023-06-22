package Interfaces;
import AccountsClass.Account;
import AccountsClass.Transaction;

import java.time.LocalTime;

public interface iAccount {

    public void displayBalance();
    public void withdraw(double saldo);
    public void transfer(Account account, double balance);
    public void deposit(double balance);
    public void addTransaction(Transaction transactions);


}
