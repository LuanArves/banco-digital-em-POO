package UserClass;

import AccountsClass.Account;

public class User {

    private String idCostumer;
    private String name, occupation;
    private Aaddress address;
    private Account account;


    public User(String idCostumer, String name, String occupation, Aaddress address, Account account) {
        this.idCostumer = idCostumer;
        this.name = name;
        this.occupation = occupation;
        this.address = address;
        this.account = account;
    }

    public String toString(){
        return "Nome : " + this.getName() +
                "Profissão : " + this.getOccupation() +
                "Endereço : " + this.getAddress() +
                "Conta : " + this.getAccount();
    }

    public Account getAccount() {
        return account;
    }
    public String getIdCostumer() {
        return idCostumer;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public Aaddress getAddress() {
        return address;
    }
}
