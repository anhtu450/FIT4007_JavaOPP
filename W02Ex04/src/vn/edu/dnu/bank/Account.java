package vn.edu.dnu.bank;

public class Account {
    private long accountNumber;
    private String accountName;
    private double balance;
    private static final double INTEREST_RATE = 0.035;

    public Account(){
        this.accountNumber = 0;
        this.accountName = "Tên: ";
        this.balance = 0.0;
    }
    public Account(long accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    public Account(long accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 50.0;
    }   
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){
        return String.format("Số tài khoản: %d\nTên tài khoản: %s\nSố tiền: %2f VNĐ", accountNumber,accountName,balance);
    }
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ.");
        }
    }

    public void withdraw(double amount){
        double fee = 0.0;
        if (amount + fee <= balance) {
            balance -= (amount + fee);
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }
    public void maturity() {
        balance += balance * INTEREST_RATE;
    }

    public void transfer(Account targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
        } else {
            System.out.println("Số tiền chuyển không hợp lệ.");
        }
    }
}
