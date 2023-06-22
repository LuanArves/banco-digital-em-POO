package AccountsClass;

public class CurrentAccount extends Account {
    private double overdraft;

    public CurrentAccount(String id, double saldo) {
        super(id, saldo);
        this.overdraft = 30.0;
    }


    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
