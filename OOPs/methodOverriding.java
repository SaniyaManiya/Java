class Bank {
    int getRate() {
        return 5;
    }
}

class SBI extends Bank {
    int getRate() {
        return 7;
    }

    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println(b.getRate());
    }
}
