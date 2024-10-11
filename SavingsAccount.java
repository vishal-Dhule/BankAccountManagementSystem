package Bank_Account_Management_System;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest + ". New balance: $" + balance);
    }
    
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal!");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
        }
    }
}
