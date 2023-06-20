package AccountsClass;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(String id, int numero_conta, int numero_agencia, double saldo) {
        super(id, numero_conta, numero_agencia, saldo);
        this.interestRate = 0.5;
    }

    public void calcularJuros(){
        double juros = getSaldo() + (interestRate/100);
        deposit(juros);
    }

    public double getInterestRate() {
        return interestRate;
    }
}
