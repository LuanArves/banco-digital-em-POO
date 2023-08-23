import AccountsClass.Account;
import AccountsClass.CurrentAccount;
import AccountsClass.SavingAccount;
import AccountsClass.Transaction;
import UserClass.Aaddress;
import UserClass.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//---------------------------------------------------------------------------------------------------------
        ArrayList<Account> listaContas = new ArrayList<>();
        ArrayList<User> listaUsuarios = new ArrayList<>();

       /* Account conta1 = new CurrentAccount( 5000.0f);
        Account conta2 = new CurrentAccount(50.0f);
        Aaddress end = new Aaddress("Rua las vegas", "34", "Novo mundo", "Uberlandia");
        User usuario = new User( "Joao", "Desempregado", end, conta2);
        User usario2 = new User("Luan", "Vagabundo", end, conta1);
//-------------------------------------------------------------------------------------------------------
        conta2.deposit(500.0);
        conta2.deposit(600.0);
//---------------------------------------------------------------------------------------------------
        int busca = 1;
        int indice = -1;
        for (Account teste : listaContas){
            if (teste.getNumero_conta() == busca){
                indice =listaContas.indexOf(teste);
                listaContas.get(indice).transfer(conta2,400);
            }
        }
        /*
        Lógica de busca : é utilizado um objeto do tipo Account para percorrer toda a listaContas, então foi colocado
        um if para localizar um valor especifico dentro de um objeto contido na listaContas caso for encontrado utilizaremos
        o metodo .indexOf para pegar o indice desse objeto e então utilizaremos o metodo .get para ter acesso aos
        valores do objeto para que assim seja possivel trabalhar com ele atravez do metodo .deposit
         */
//-----------------------------------------------------------------------------------------------------------
       //conta2.transfer(conta1, 100.0);
       // conta2.transfer(conta1, 500.0);
//-----------------------------------------------------------------------------------------------------------
        //usario2.gerarExtrato();
        //usuario.gerarExtrato();
//------------------------------------------------------------------------------------------------------------
        //System.out.println(usario2);
        //System.out.println(usuario);
//------------------------------------------------------------------------------------------------------------
        String opcao = "j";
        String numero, rua, bairro, cidade;
        String nome, occupation;
        String escolha;
        double valor;
        int chose = 0;
        do {
            System.out.println("1 --- Creat a new account ");
            System.out.println("2 --- Deposit");
            System.out.println("3 --- Withdraw");
            System.out.println("4 --- Transfer");
            System.out.println("6 --- Exit");
            System.out.println("7 --- teste");
            chose = teclado.nextInt();
            teclado.nextLine();

            switch (chose){

                case 1 :
                    System.out.println("Entre com o numero da casa : ");
                    numero = teclado.nextLine();
                    System.out.println("Nome da rua : ");
                    rua = teclado.nextLine();
                    System.out.println("Bairro : ");
                    bairro = teclado.nextLine();
                    System.out.println("Cidade : ");
                    cidade = teclado.nextLine();
                    Aaddress adress = new Aaddress(rua,numero,bairro,cidade);

                    System.out.println("Qual o seu nome : ");
                    nome = teclado.nextLine();
                    System.out.println("Qual a sua profissão : ");
                    occupation = teclado.nextLine();
                    System.out.println("Escolha qual tipo de conta deseja (corrente/poupanca)");
                    escolha = teclado.nextLine();
                    if(escolha.equals("corrente")){
                        System.out.println("Faça o seu primeiro deposito de qualquer valor para validar sua conta corrente : ");
                        valor = teclado.nextDouble();
                        Account accountCurrent = new CurrentAccount(valor);
                        User userCurrent = new User(nome, occupation, adress);

                        listaUsuarios.add(userCurrent);//Adicionando o usuario na lista de usuarios
                        userCurrent.addAccount(accountCurrent);//Adicionando a conta na lista de contas desse usuario

                        for (User testeUser : listaUsuarios){
                            if (testeUser.getName().equals(nome)){
                            System.out.println("Conta criada com sucesso " + testeUser.getName());
                            System.out.println(testeUser.getOccupation());
                            System.out.println(testeUser.getAddress());
                            System.out.println(testeUser.getListaContas());
                            }else System.out.println("Erro ao criar a conta " + testeUser.getName());
                        }
                    }else if(escolha.equals("poupanca")) {
                        System.out.println("Faça o seu primeiro deposito de qualquer valor para validar sua conta poupanca : ");
                        valor = teclado.nextDouble();
                        Account accountSaving = new SavingAccount(valor);
                        User userSaving = new User(nome, occupation, adress);

                        listaUsuarios.add(userSaving); //Adicionando o usuario na lista de usuarios
                        userSaving.addAccount(accountSaving); //Adicionando a conta na lista de contas desse usuario

                        for (User testeUser : listaUsuarios){
                            if (testeUser.getName().equals(nome)){
                                System.out.println("Conta criada com sucesso " + testeUser.getName());
                                System.out.println(testeUser.getOccupation());
                                System.out.println(testeUser.getAddress());
                                System.out.println(testeUser.getListaContas());
                            }else System.out.println("Erro ao criar a conta :(");
                        }
                    }
                break;
                    case 2 :
                        int buscaId;
                        int index = -1;
                        double valors;
                        System.out.println("Digite o Numero de sua conta : ");
                        buscaId = teclado.nextInt();

                    break;
            }

        }while (chose != 6);


        teclado.close();
    }
}