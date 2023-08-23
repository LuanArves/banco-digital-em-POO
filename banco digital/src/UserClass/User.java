package UserClass;

import AccountsClass.Account;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class User implements Serializable {

    private String idCostumer;
    private String name, occupation;
    private Aaddress address;
    //private Account account;
    private ArrayList<Account> listaContas;

    public User(String name, String occupation, Aaddress address) {
        this.idCostumer = generateIDnumber();
        this.name = name;
        this.occupation = occupation;
        this.address = address;
        this.listaContas = new ArrayList<>();
    }

    //Generate a random ID
    private String generateIDnumber(){
        Random idNumber = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < 4; i++){
            int number = idNumber.nextInt(10);
            sb.append(number);
        }

        return sb.toString();
    }
    public String toString(){
        return "Nome : " + this.getName() +
                "Profissão : " + this.getOccupation() +
                "Endereço : " + this.getAddress() +
                "Conta : " + this.listaContas;
    }
    public void addAccount(Account account){ //Metodo para adicionar uma conta ao usuario
        getListaContas().add(account);
    }

    public void leituraExtrato(){
        Scanner Teclado = new Scanner(System.in);


    }
    public void gerarExtrato(){
        Scanner teclado = new Scanner(System.in);
        //Organizando a saida do objeto
        String idCostumer = getIdCostumer();
        String name = getName();
        String occupation = getOccupation();
        String address = getAddress().toString();
        String accountInfo = getListaContas().toString();
        String fileData = idCostumer + ","
                + name + ","
                + occupation + ","
                + address + ","
                + accountInfo;

        //Inserindo uma data para diferenciar diversos arquivos gerados
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dateFormat.format(new Date());
        String fileName = "statement_" + getName() +"_"+ timestamp + ".csv";


        //criando a pasta e o arquivo de txt/csv
        File sourceFile = new File("C:\\ProjetosJava");
            String sourceFolderStr = sourceFile.getPath();
            boolean success = new File(sourceFolderStr + "/files").mkdir(); //criando a pasta
            String targetFileStr = sourceFolderStr + "/files/" + fileName;

        //Escrevendo no arquivo
        try(BufferedWriter bw = new  BufferedWriter(new FileWriter(targetFileStr))){ //Gravando o objeto usuario em um arquivo so tipo csv.
            bw.write(fileData);
            bw.newLine();
            System.out.println("Arquivo Gerado com sucesso");
        }catch (IOException e){
            System.out.println("Erro ao escrever o arquivo : " + e.getMessage());
        }
        teclado.close();
    }

    public ArrayList<Account> getListaContas() {
        return listaContas;
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
