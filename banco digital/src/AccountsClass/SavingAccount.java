package AccountsClass;

import java.util.Random;

public class SavingAccount extends Account {

    private double interestRate;
    private String id;

    public SavingAccount(double saldo) {
        super(saldo);
        this.interestRate = 0.5;
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

    public void calcularJuros(){
        double juros = getSaldo() + (interestRate/100);
        deposit(juros);
    }

    public double getInterestRate() {
        return interestRate;
    }
}
