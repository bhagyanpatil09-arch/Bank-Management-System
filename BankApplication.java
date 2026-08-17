import java.util.Scanner;

public class Bank {

    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    Bank(String bankName, int userId, String userName, long accountNumber, String accountType, double balance) {
        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;

    }

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);

    }

    void displayUserDetails() {
        System.out.println("UserId: " + userId);
        System.out.println("UserName: " + userName);

    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }

    String accountSummary() {
        String accountSummary = "Bank name : " + bankName
                + "\nUser name : " + userName
                + "\nAccount number : " + accountNumber
                + "\nAccpunt Type: " + accountType
                + "\nbalance: " + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean result = false;
        if (balance >= minimumBalance) {
            result = true;
        }
        return result;
    }

}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bankName = scanner.nextLine();

        int userId = scanner.nextInt();
        scanner.nextLine();

        String userName = scanner.nextLine();

        long accountNumber = scanner.nextLong();
        scanner.nextLine();

        String accountType = scanner.nextLine();

        double openingBalance = scanner.nextDouble();
        Bank bank = new Bank(bankName, userId, userName, accountNumber, accountType, openingBalance);

        bank.displayBankDetails();

        bank.displayUserDetails();

        bank.displayAccountDetails();

        String accountSummary = bank.accountSummary();
        System.out.println(accountSummary);

        double minimumBalance = scanner.nextDouble();
        boolean isMaintained = bank.hasMinimumBalance(minimumBalance);

        if (isMaintained) {
            System.out.println("Minimum balance is maintained.");
        } else {
            System.out.println("Minimum balance is not maintained.");
        }

        scanner.close();
    }
}
