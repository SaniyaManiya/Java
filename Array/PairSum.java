class PairSum {
    public static void main(String[] args) {
        int[] a={2,4,3,5,7};
        int sum=9;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==sum)
                    System.out.println(a[i]+" "+a[j]);
            }
        }
    }
}
