package AccountsClass;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(String id, double saldo) {
        super(id, saldo);
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
