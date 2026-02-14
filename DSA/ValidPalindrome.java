public class ValidPalindrome {
    public static void main(String[] args){
        String s="A man, a plan, a canal: Panama";
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int l=0,r=s.length()-1;
        boolean ok=true;

        while(l<r)
            if(s.charAt(l++)!=s.charAt(r--)){
                ok=false;
                break;
            }

        System.out.println(ok);
    }
}
