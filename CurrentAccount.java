package Bank_Account_Management_System;

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > (balance + overdraftLimit)) {
            throw new InsufficientFundsException("Withdrawal exceeds overdraft limit!");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        }
    }
}
