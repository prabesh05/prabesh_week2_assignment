/*Bank Account System Create a class BankAccount with attributes accountHolderName, accountNumber, and balance.
 Create a constructor to initialize them. 
 Create methods deposit(amount) and withdraw(amount) which modify the balance. Show messages if withdrawal amount exceeds balance. */


public class Bank {
    public String accountHolderName;
    public int accountNumber;
    public float balance;

    public Bank(String accName, int accNum, float balance) {
        this.accountHolderName = accName;
        this.accountNumber = accNum;
        this.balance = balance;
    }


    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void showDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    
    }

    public static void main(String[] args) {
        Bank myAccount = new Bank("John Doe", 123456, 1000);

        myAccount.showDetails();

        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.withdraw(2000);
        myAccount.showDetails();
    }
}
