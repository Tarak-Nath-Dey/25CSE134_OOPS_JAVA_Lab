//Write a Java program to create a class known as "Bank Account" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }
}

class SavingsAccount extends BankAccount {

    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance = balance - amount;
        } else {
            System.out.println("Since balance is "+ (balance - amount) +" so withdrawal not allowed.");
        }
    }

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();

        account.deposit(500);
        System.out.println("Balance: " + account.balance);

        account.withdraw(300);
        System.out.println("Balance: " + account.balance);

        account.withdraw(150);
        System.out.println("Balance: " + account.balance);
    }
}
