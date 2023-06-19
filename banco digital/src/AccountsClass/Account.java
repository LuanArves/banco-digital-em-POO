package AccountsClass;

public class Account {

    private String id;
    private int numero_conta, numero_agencia;
    private double saldo;

    public Account(String id, int numero_conta, int numero_agencia, double saldo) {
        this.id = id;
        this.numero_conta = numero_conta;
        this.numero_agencia = numero_agencia;
        this.saldo = saldo;
    }
}
