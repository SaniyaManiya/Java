class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.add(5, 10));
        System.out.println(m.add(5.5, 2.2));
    }
}
