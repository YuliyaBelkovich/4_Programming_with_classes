package by.epam.javaIntro.bankAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client implements Comparator <Account> {
    private String name;
    private ArrayList <Account> accounts;

    public Client(String name){
        this.name = name;
        accounts = new ArrayList<Account>();
    }

    public void getNewAccount(int balance){
        Account account = new Account(balance);
        accounts.add(account);
    }

    public void replenishBalance(int numberOfAccount, int amount){
        this.accounts.get(numberOfAccount-1).setBalance(amount);
    }
    public void withdrawMoney(int numberOfAccount, int amount){
        this.accounts.get(numberOfAccount-1).reduceBalance(amount);
    }

   public void sortAccountsByBalance(){

        Comparator <Account> sortByBalance = new Comparator<Account>() {

            @Override
            public int compare(Account o1, Account o2) {
                return o1.getBalance()-o2.getBalance();
            }
        };
        Collections.sort(accounts,sortByBalance);
   }

   public void searchAccountByBalance(int balance){
       System.out.println("Accounts with current balance more than "+balance+":");

        for(int i =0; i<this.accounts.size();i++){

            if(accounts.get(i).getBalance()>balance){
                System.out.println("Account "+(i+1)+accounts.get(i).toString());
            }
        }
    }
    public void getBalanceOnAccount(int numberOfAccount){
        System.out.println("You have "+this.accounts.get(numberOfAccount-1).getBalance()+" $ on your "+numberOfAccount+" account");
    }

    public void getNumbersOfAccounts(){
        System.out.println("You have "+this.accounts.size()+" accounts");
    }

    public void getSumBalance(){
        int sum=0;

        for(int i =0; i<this.accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }
        System.out.println("Summary balance: "+sum);
    }

    public void getSumPositiveBalance(){
        int sum=0;

        for(int i =0; i<this.accounts.size();i++){

            if(accounts.get(i).getBalance()>0){
                sum+=accounts.get(i).getBalance();
            }
        }
        System.out.println("Summary balance of accounts with positive balance: "+sum);
    }


    public void getSumNegativeBalance(){
        int sum=0;

        for(int i =0; i<this.accounts.size();i++){

            if(accounts.get(i).getBalance()<0){
                sum+=accounts.get(i).getBalance();
            }
        }
        System.out.println("Summary balance of accounts with negative balance: "+sum);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    @Override
    public int compare(Account o1, Account o2) {
        return 0;
    }
}
