public class BankAccount {
    private String accountHolderName;
    private double balance;


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.accountHolderName = "Not defined";
        this.balance = 0.0;
    }

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public void deposit(double toDeposit) {
        if (toDeposit > 0) {
            this.balance += toDeposit;
        } else {
            System.out.println("Please insert a positive valid value");
        }
    }

    public boolean withdraw(double toWithdraw) {
        if (toWithdraw <= this.balance) {
            this.balance -= toWithdraw; // Atualiza o saldo ao sacar
            return true;
        } else {
            return false;
        }
    }

    public double getBalanceValue() {
        return this.balance;
    }

}
