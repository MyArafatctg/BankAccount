import java.util.ArrayList;
import java.util.List;

public class Main {
    static double totalBalance;
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount account1 = new BankAccount("acc123","Arafat",500.00);
        BankAccount account2 = new BankAccount("acc456","Yasin",700.00);

        account1.deposite(200);
        account1.withdraw(100);
        account1.transfer(account1,150);

        accounts.add(account1);
        accounts.add(account2);

        for (BankAccount account : accounts) {
            totalBalance += account.getBalance();
        }
        System.out.println(totalBalance);
    }
}