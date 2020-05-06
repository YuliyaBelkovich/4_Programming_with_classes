package by.epam.javaIntro.bankAccount;

public class Account {

    private boolean isBlocked;
    private int balance;

    public Account(int balance){
        this.balance = balance;
        isBlocked = false;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }
    public void reduceBalance(int balance){
        this.balance-= balance;
    }

    public void blockAccount(){
        if(!this.isBlocked()) {
            this.isBlocked = true;
        } else {
            System.out.println("Your account is already blocked");
        }
    }

    public void unblockAccount(){
        if(!this.isBlocked()) {
            this.isBlocked = true;
        } else {
            System.out.println("Your account is already active");
        }
    }

    @Override
    public String toString() {
        return " isBlocked=" + isBlocked +
                ", balance=" + balance;
    }
}
