class Frequency {
    public static void main(String[] args) {
        int[] a={1,2,2,3,1};

        for(int i=0;i<a.length;i++){
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=-1;
                }
            }
            if(a[i]!=-1)
                System.out.println(a[i]+" -> "+count);
        }
    }
}
