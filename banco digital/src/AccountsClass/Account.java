package AccountsClass;
import Interfaces.iAccount;
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
    public double displayBalance() {
        return 0;
    }
    @Override
    public double withdraw(double saldo) {
        return 0;
    }
    @Override
    public double transfer(Account account, double balance) {
        return 0;
    }
    @Override
    public double deposit(double balance) {
        return 0;
    }
    @Override
    public void addTransaction(Transaction transaction) {

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
