public class PalPartition {
    static boolean isPal(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    static void solve(String s,String cur){
        if(s.isEmpty()){
            System.out.println(cur);
            return;
        }
        for(int i=1;i<=s.length();i++){
            String p=s.substring(0,i);
            if(isPal(p))
                solve(s.substring(i),cur+p+" | ");
        }
    }

    public static void main(String[] args){
        solve("aab","");
    }
}
