class BankAccount {
    private String username;
    private String password;
    private double balance;
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
public class Main1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setUsername("Aasritha");
        account.setPassword("12345");
        account.setBalance(10000);
        System.out.println("Username: " + account.getUsername());
        System.out.println("Balance: " + account.getBalance());
        account.deposit(5000);
        account.withdraw(3000);
    }
}