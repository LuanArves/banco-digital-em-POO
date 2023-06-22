package Interfaces;

import AccountsClass.Account;
import AccountsClass.Transaction;

public interface iStatement {

    public void addTransaction(Account account);
    public void generateStatenent();

}
