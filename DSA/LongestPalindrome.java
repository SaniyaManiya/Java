public class LongestPalindrome {
    public static void main(String[] args){
        String s="babad";
        int start=0,max=1;

        for(int i=0;i<s.length();i++){
            for(int l=i,r=i;l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r);l--,r++)
                if(r-l+1>max){max=r-l+1;start=l;}
        }

        System.out.println(s.substring(start,start+max));
    }
}
