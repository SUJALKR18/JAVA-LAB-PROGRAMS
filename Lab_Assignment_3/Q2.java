import java.util.Scanner;
class Account {
    long accno;
    double balance;
    String name;
    String type;
    Account() {
        accno = 00000000000000;
        name = "Default";
        type = "Default";
        balance = 0;
    }
    Account(double balance, long accno, String name, String type) {
        this.accno = accno;
        this.balance = balance;
        this.name = name;
        this.type = type;
    }
    void displayAcDetails() {
        System.out.println("Account Details : ");
        System.out.println("Name : " + name);
        System.out.println("Account No. : " + accno);
        System.out.println("AccountType : " + type);
        System.out.println("Account Balance : " + balance);
    }
}
class SavingAccount extends Account {
    double minbal;
    double withdrawlimit;
    double interest;
    SavingAccount() {
        type = "Savings";
        minbal = 1000;
        withdrawlimit = 500;
        interest = 7.0;
    }
    SavingAccount(double minbal, double withdrawlimit, double interest, double bal, long accno, String name, String type) {
        super(bal, accno, name, type);
        this.minbal = minbal;
        this.withdrawlimit = withdrawlimit;
        this.interest = interest;
    }
    @Override
    void displayAcDetails() {
        System.out.println("Account Details : ");
        System.out.println("Name : " + name);
        System.out.println("Account No. : " + accno);
        System.out.println("AccountType : " + type);
        System.out.println("Minimum Balance : " + minbal);
        System.out.println("Withdraw Limit: " + withdrawlimit);
        System.out.println("Interest : " + interest);
        System.out.println("Account Balance : " + balance);
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully!");
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else if (amount > withdrawlimit) {
            System.out.println("Entered amount is greater than withdraw limit");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        }
    }
}
class CurrentAccount extends Account {
    double withdrawlimit;
    int noofTxperday;
    double interest;
    int trans = 0;
    CurrentAccount() {
        noofTxperday = 10;
        type = "Current";
        withdrawlimit = 500;
        interest = 7.0;
    }
    CurrentAccount(int noofTxperday, double withdrawlimit, double interest, double bal, long accno, String name, String type) {
        super(bal, accno, name, type);
        this.noofTxperday = noofTxperday;
        this.withdrawlimit = withdrawlimit;
        this.interest = interest;
    }
    @Override
    void displayAcDetails() {
        System.out.println("Account Details : ");
        System.out.println("Name : " + name);
        System.out.println("Account No. : " + accno);
        System.out.println("AccountType : " + type);
        System.out.println("Number of Transactions per day  : " + noofTxperday);
        System.out.println("Withdraw Limit: " + withdrawlimit);
        System.out.println("Interest : " + interest);
        System.out.println("Account Balance : " + balance);
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully!");
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } 
        else if (amount > withdrawlimit) {
            System.out.println("Entered amount is greater than withdraw limit");
        } 
        else {
            if (trans > noofTxperday) {
                System.out.println("Transaction limit reached");
                return;
            }
            balance -= amount;
            trans++;
            System.out.println("Amount Withdrawn Successfully!");
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount savingAcc = null;
        CurrentAccount currentAcc = null;
        while (true) {
            System.out.println("\nBank Account Operations Menu:");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Display Account Details");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    long accno = sc.nextLong();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    System.out.print("Enter Minimum Balance: ");
                    double minbal = sc.nextDouble();
                    System.out.print("Enter Withdraw Limit: ");
                    double withdrawLimit = sc.nextDouble();
                    System.out.print("Enter Interest Rate: ");
                    double interest = sc.nextDouble();
                    savingAcc = new SavingAccount(minbal, withdrawLimit, interest, balance, accno, name, "Savings");
                    System.out.println("Savings Account Created Successfully!");
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    accno = sc.nextLong();
                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();
                    System.out.print("Enter Number of Transactions per Day: ");
                    int noofTx = sc.nextInt();
                    System.out.print("Enter Withdraw Limit: ");
                    withdrawLimit = sc.nextDouble();
                    System.out.print("Enter Interest Rate: ");
                    interest = sc.nextDouble();
                    currentAcc = new CurrentAccount(noofTx, withdrawLimit, interest, balance, accno, name, "Current");
                    System.out.println("Current Account Created Successfully!");
                    break;
                case 3:
                    System.out.println("\n1. Savings Account\n2. Current Account");
                    System.out.print("Choose account type: ");
                    int type = sc.nextInt();
                    if (type == 1 && savingAcc != null) {
                        savingAcc.displayAcDetails();
                    } else if (type == 2 && currentAcc != null) {
                        currentAcc.displayAcDetails();
                    } else {
                        System.out.println("Account not created yet!");
                    }
                    break;
                case 4:
                    System.out.println("\n1. Savings Account\n2. Current Account");
                    System.out.print("Choose account type: ");
                    type = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    if (type == 1 && savingAcc != null) {
                        savingAcc.deposit(amount);
                    } else if (type == 2 && currentAcc != null) {
                        currentAcc.deposit(amount);
                    } else {
                        System.out.println("Account not created yet!");
                    }
                    break;
                case 5:
                    System.out.println("\n1. Savings Account\n2. Current Account");
                    System.out.print("Choose account type: ");
                    type = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    if (type == 1 && savingAcc != null) {
                        savingAcc.withdraw(amount);
                    } else if (type == 2 && currentAcc != null) {
                        currentAcc.withdraw(amount);
                    } else {
                        System.out.println("Account not created yet!");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using our banking system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
