package AccountsClass;

import java.time.LocalTime;

public class Transaction {

    private LocalTime hourDate;
    private String id;
    private String description;
    private double valor;

    public Transaction(LocalTime hourDate, String id, String description, double valor) {
        this.hourDate = hourDate;
        this.id = id;
        this.description = description;
        this.valor = valor;
    }

    public LocalTime getHourDate() {
        return hourDate;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getValor() {
        return valor;
    }
}
