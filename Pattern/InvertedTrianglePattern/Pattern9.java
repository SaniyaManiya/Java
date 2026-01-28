class Pattern9 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            int num = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
