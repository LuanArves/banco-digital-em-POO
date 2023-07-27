package UserClass;

import AccountsClass.Account;

import java.io.*;

public class User implements Serializable {

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

    public void gerarExtrato(){

        try {

            FileOutputStream fileout = new FileOutputStream("C:\\temp\\in.txt");
            ObjectOutputStream userOut = new ObjectOutputStream(fileout);
            userOut.writeObject(this); // grava o proprio objeto da classe User
            userOut.close();

            System.out.println("Extrato gerado com sucesso!");

        }catch (IOException e){
            System.out.println("Erro ao gravar informações do usuario : " + e.getMessage());
        }


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
