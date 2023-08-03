import AccountsClass.Account;
import AccountsClass.CurrentAccount;
import AccountsClass.Transaction;
import UserClass.Aaddress;
import UserClass.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Account> listaContas = new ArrayList<>();

        Account conta1 = new CurrentAccount("23", 5000.0f);

        Account conta2 = new CurrentAccount("30", 50.0f);

        Aaddress end = new Aaddress("Rua las vegas", "34", "Novo mundo", "Uberlandia");
        User usuario = new User("3", "Joao", "Desempregado", end, conta2);
        User usario2 = new User("4","Luan", "Vagabundo", end, conta1);
        conta2.deposit(500.0);
        conta2.deposit(600.0);

        String busca = "23";
        int indice = -1;

        for (Account teste : listaContas){
            if (teste.getId().equals(busca)){
                indice =listaContas.indexOf(teste);
                listaContas.get(indice).deposit(200);
            }
        }

        conta2.transfer(conta1, 300.0);
        conta2.transfer(conta1, 500.0);

        usario2.gerarExtrato();
        //usuario.gerarExtrato();



        //System.out.println(usuario);






    }
}