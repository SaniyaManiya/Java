class Pattern5 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int s=5;s>i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
