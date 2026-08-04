
class BankAccount {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        ac.setBalance(6000);
        System.out.println("Balance: " + ac.getBalance());
    }
}
