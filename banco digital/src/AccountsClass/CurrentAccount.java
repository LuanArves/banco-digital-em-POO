package AccountsClass;

public class CurrentAccount extends Account {

    private double overdraft;

    public CurrentAccount(String id, int numero_conta, int numero_agencia, double saldo) {
        super(id, numero_conta, numero_agencia, saldo);
        this.overdraft = 30.0;
    }


    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
