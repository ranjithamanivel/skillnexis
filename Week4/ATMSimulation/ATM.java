package week4.ATMSimulation;

import java.io.*;
import java.util.Scanner;

public class ATM {

    static Scanner sc = new Scanner(System.in);
    static Account account;

    public static void main(String[] args) {

        loadAccount();

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    account.display();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    saveAccount();
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);
    }

    static void loadAccount() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("week4/ATMSimulation/account.txt"));

            String line = br.readLine();

            String[] data = line.split(",");

            account = new Account(
                    Integer.parseInt(data[0]),
                    data[1],
                    Double.parseDouble(data[2]));

            br.close();

        } catch(Exception e) {

            System.out.println("Error Loading Account");

        }
    }

    static void saveAccount() {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("week4/ATMSimulation/account.txt"));

            bw.write(account.accountNo + "," +
                    account.name + "," +
                    account.balance);

            bw.close();

            System.out.println("Data Saved.");

        } catch(Exception e) {

            System.out.println("Error Saving File");

        }
    }

    static void deposit() {

        System.out.print("Enter Amount: ");

        double amount = sc.nextDouble();

        account.balance += amount;

        System.out.println("Amount Deposited.");
    }

    static void withdraw() {

        System.out.print("Enter Amount: ");

        double amount = sc.nextDouble();

        if(amount <= account.balance) {

            account.balance -= amount;

            System.out.println("Withdrawal Successful.");

        }
        else {

            System.out.println("Insufficient Balance.");

        }

    }

}