public class KMPCount {
    static int count(String t,String p){
        int m=p.length(), n=t.length();
        int[] lps=new int[m];

        for(int i=1,len=0;i<m;){
            if(p.charAt(i)==p.charAt(len)) lps[i++]=++len;
            else if(len>0) len=lps[len-1];
            else lps[i++]=0;
        }

        int i=0,j=0,c=0;
        while(i<n){
            if(t.charAt(i)==p.charAt(j)){ i++; j++; }
            if(j==m){ c++; j=lps[j-1]; }
            else if(i<n && t.charAt(i)!=p.charAt(j)){
                if(j>0) j=lps[j-1]; else i++;
            }
        }
        return c;
    }

    public static void main(String[] args){
        System.out.println(count("ababcabcabc","abc"));
    }
}
