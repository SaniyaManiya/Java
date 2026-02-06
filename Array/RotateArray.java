class RotateArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int k=2;

        for(int i=k;i<a.length;i++)
            System.out.print(a[i]+" ");

        for(int i=0;i<k;i++)
            System.out.print(a[i]+" ");
    }
}
