class Bike {
    void run() {
        System.out.println("Bike is running");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("Honda is running fast");
    }

    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
    }
}
