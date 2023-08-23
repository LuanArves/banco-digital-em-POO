package AccountsClass;

import java.util.Random;

public class CurrentAccount extends Account {
    private double overdraft;
    private String id;

    public CurrentAccount(double saldo) {
        super(saldo);
        this.overdraft = 30.0;
        this.id = generateIDnumber();
    }
    private String generateIDnumber(){
        Random idNumber = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < 4; i++){
            int number = idNumber.nextInt(10);
            sb.append(number);
        }

        return sb.toString();
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
