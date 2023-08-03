package UserClass;

import AccountsClass.Account;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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

    public void leituraExtrato(){

    }
    public void gerarExtrato(){
        Scanner teclado = new Scanner(System.in);

        String idCostumer = getIdCostumer();
        String name = getName();
        String occupation = getOccupation();
        String address = getAddress().toString();
        String accountInfo = getAccount().toString();

        String fileData = idCostumer + "," + name + "," + occupation + "," + address + "," + accountInfo;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(new Date());
        String fileName = "statement_" + timestamp + ".csv";



        File sourceFile = new File("C:\\ProjetosJava");
            String sourceFolderStr = sourceFile.getPath();
            boolean success = new File(sourceFolderStr + "/files").mkdir();

            String targetFileStr = sourceFolderStr + "/files/statement.csv";

            if (targetFileStr!=null){
                targetFileStr = sourceFolderStr + "/files" + fileName;
            }
        try(BufferedWriter bw = new  BufferedWriter(new FileWriter(targetFileStr))){
            bw.write(fileData);
            bw.newLine();
        }catch (IOException e){
            System.out.println("Erro ao escrever o arquivo : " + e.getMessage());
        }

        teclado.close();
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
