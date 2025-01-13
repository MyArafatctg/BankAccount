public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    //Constrator
    public BankAccount(String accountNumber, String accountName, double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    };

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposite(double amount) {
        if (amount > 0){
            balance += amount;
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -=amount;
            return true;
        }else {
            return false;
        }
    }

    public boolean transfer(BankAccount recipient, double amount){
        if (this.withdraw(amount)){
            recipient.deposite(amount);
            return true;
        }else {
            return false;
        }
    }

}
