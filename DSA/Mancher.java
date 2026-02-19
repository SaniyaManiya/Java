public class Manacher {
    public static void main(String[] args){
        String s="abba";
        String t="^#"+String.join("#",s.split(""))+"#$";
        int[] p=new int[t.length()];
        int c=0,r=0;

        for(int i=1;i<t.length()-1;i++){
            int mir=2*c-i;
            if(i<r) p[i]=Math.min(r-i,p[mir]);

            while(t.charAt(i+1+p[i])==t.charAt(i-1-p[i])) p[i]++;

            if(i+p[i]>r){
                c=i;
                r=i+p[i];
            }
        }

        int max=0;
        for(int x:p) max=Math.max(max,x);
        System.out.println(max);
    }
}
