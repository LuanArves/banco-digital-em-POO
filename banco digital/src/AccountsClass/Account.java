package AccountsClass;
import Interfaces.iAccount;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Account implements iAccount {

    private String id;
    private int numero_conta, numero_agencia;
    private double saldo;
    private ArrayList<Transaction> listaTransacao;

    public Account(String id, int numero_conta, int numero_agencia, double saldo) {
        this.id = id;
        this.numero_conta = numero_conta;
        this.numero_agencia = numero_agencia;
        this.saldo = saldo;
        this.listaTransacao = new ArrayList<>();
    }

    //Especial Methods
    @Override
    public void displayBalance() {

    }
    @Override
    public void withdraw(double saldo) {

    }
    @Override
    public void transfer(Account account, double balance) {
        account.deposit(balance);
        saldo -= balance;
        setSaldo(saldo);
    }
    @Override
    public void deposit(double balance) {
        balance += this.saldo;
        setSaldo(balance);
    }
    @Override
    public void addTransaction(LocalTime hourDate, String id, String description, double valor){
        Transaction transaction = new Transaction(hourDate, id, description, valor);
        listaTransacao.add(transaction);
    }
    //Getters and setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public int getNumero_agencia() {
        return numero_agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Transaction> getListaTransacao() {
        return listaTransacao;
    }


}
