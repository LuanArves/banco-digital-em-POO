package AccountsClass;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {

    private LocalDate hourDate ;
    private String id;
    private String description;


    public Transaction(LocalDate hourDate, String id, String description) {
        this.hourDate = LocalDate.now();
        this.id = id;
        this.description = description;
    }

    public String toString(){
        return "Data : " + getHourDate() +
                "id : " + getId() +
                "Descrição : " + getDescription();

    }

    public LocalDate getHourDate() {
        return hourDate;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
