package AccountsClass;
import Interfaces.iStatement;
import java.time.LocalDate;

public class Statement implements iStatement{

        private LocalDate dataHour;
        private Account costumerAccount;

    public Statement(LocalDate dataHour, Account costumerAccount) {
        this.dataHour = dataHour;
        this.costumerAccount = costumerAccount;
    }

    @Override
    public void addTransaction(Account account) {

    }

    @Override
    public void generateStatenent() {
        /*try {

        }catch ();
         */
    }



    public LocalDate getDataHour() {
        return dataHour;
    }

    public Account getCostumerAccount() {
        return costumerAccount;
    }
}
