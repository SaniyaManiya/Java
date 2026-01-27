class Account {
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        System.out.println(a.getBalance());
    }
}
