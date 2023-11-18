import java.util.Scanner;

public class TASK3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(10000); // Instantiate BankAccount here

        while (true) {
            // Create an ATM instance
            ATM atm = new ATM(account); // Pass BankAccount to ATM constructor

            // Display the ATM menu
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");

            // Ask the user for their choice
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            System.out.println("\n");

            // Perform the chosen action
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + atm.checkBalance()+"/-");
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawalAmount = scanner.nextDouble();
                    System.out.println("\n");
                    atm.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    System.out.println("\n");
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Terminating the Transaction...Exiting the ATM...");
                    System.out.println("\t!!Thank you for Banking with us!!\n");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public double checkBalance() {
        return account.getBalance();
    }

    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("---Transaction failed---\nDue to Insufficient balance\nAvailable balance is: " + account.getBalance()+"/-");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("---Transaction successful---\nYour new balance is: " + account.getBalance()+"/-");
        }
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("---Transaction successful---\nYour new balance is: " + account.getBalance()+"/-");
    }
}