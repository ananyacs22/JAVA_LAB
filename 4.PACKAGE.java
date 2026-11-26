package transaction;

public class Account {

    private int accountNo;
    private double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }
  package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account acc) {

        System.out.println("Transaction Report");

        System.out.println("Account Number: "
                + acc.getAccountNo());

        System.out.println("Current Balance: "
                + acc.getBalance());
    }
}
import transaction.Account;
import reports.TransactionReport;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(1887, 5000);

        acc.deposit(2000);

        acc.withdraw(1500);

        TransactionReport report =
               new TransactionReport();

        report.generateReport(acc);
        System.out.println("ANANYA");
        System.out.println("1WA25CS033");
    }
}
