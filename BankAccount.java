class BankAccount{
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }
    void displayBalance(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args){
        BankAccount ac = new BankAccount("shweta", 5000);
        ac.deposit(2000);
        ac.withdraw(1000);
        ac.displayBalance();
    }
}