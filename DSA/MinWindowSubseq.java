public class MinWindowSubseq {
    public static void main(String[] args){
        String s="abcdebdde",t="bde";
        int start=-1,min=Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(0)) continue;

            int p=i,q=0;
            while(p<s.length()&&q<t.length())
                if(s.charAt(p++)==t.charAt(q)) q++;

            if(q==t.length()){
                int end=p-1;
                q--;
                while(p>=i){
                    if(s.charAt(--p)==t.charAt(q)) q--;
                    if(q<0) break;
                }
                p++;
                if(end-p+1<min){
                    min=end-p+1;
                    start=p;
                }
            }
        }

        System.out.println(start==-1?"":s.substring(start,start+min));
    }
}
