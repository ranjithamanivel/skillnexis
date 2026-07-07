package week4.ATMSimulation;

public class Account {
    
    int accountNo;
    String name;
    double balance;

    public Account(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Name           : " + name);
        System.out.println("Balance        : " + balance);
    }
}
