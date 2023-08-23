package AccountsClass;
import Interfaces.iAccount;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;


public class Account implements iAccount {

    // definindo alguns valores padrões
    private static int SEQUEL = 1;
    private static int AGENCIAPADRAO = 22341;
    private String id;
    protected int numero_conta, numero_agencia;
    private double saldo;
    private ArrayList<Transaction> listaTransacao;

    LocalDate hourDate = LocalDate.now();
    String id2;
    String description;



    public Account(double saldo) {
        this.id = generateIDnumber();
        this.numero_conta = SEQUEL++; //When a new object are create begins + 1
        this.numero_agencia = Account.AGENCIAPADRAO;
        this.saldo = saldo;
        this.listaTransacao = new ArrayList<>();//inicializando o arraylist
    }

    //Especial Methods
    private String generateIDnumber(){
        Random idNumber = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < 4; i++){
            int number = idNumber.nextInt(10);
            sb.append(number);
        }

        return sb.toString();
    }
    @Override
    public void displayBalance() {
        System.out.println("Saldo atual da conta : " + this.getSaldo() + "Reais");
    }
    @Override
    public void withdraw(double valor) {
        double valor2 = 0.0;
        valor2 = this.saldo - valor;
        setSaldo(valor2);
        description = "Saque de " + valor2;
        Transaction transaction = new Transaction(hourDate, id2, description);
        addTransaction(transaction);
    }
    @Override
    public void transfer(Account account, double balance) {
        account.deposit(balance);
        saldo -= balance;
        setSaldo(saldo);
        description = "Transferencia de " + balance;
        Transaction transaction = new Transaction(hourDate, id2, description);
        addTransaction(transaction);
    }
    @Override
    public void deposit(double balance) {
       this.saldo += balance;
        setSaldo(saldo);
        description = "Deposito de " + balance;
        Transaction transaction = new Transaction(hourDate, id2, description);
        addTransaction(transaction);
    }
    @Override
    public void addTransaction(Transaction transactions){
        listaTransacao.add(transactions);
    }

    public String toString() {
        if (listaTransacao.isEmpty()){
            return "Id conta : " + this.getId() +
                    "Numero conta : " + this.getNumero_conta() +
                    "Agencia : " + this.getNumero_agencia() +
                    "Saldo atual : " + this.getSaldo() +
                    "Transações realizadas : " + "Não foi realizada nenhuma transação";
        }else {
            return "Id conta : " + this.getId() +
                    "Numero conta : " + this.getNumero_conta() +
                    "Agencia : " + this.getNumero_agencia() +
                    "Saldo atual : " + this.getSaldo() +
                    "Transações realizadas : " + getListaTransacao();
        }
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
