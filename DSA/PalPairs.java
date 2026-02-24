import java.util.*;

public class PalPairs {
    static boolean pal(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public static void main(String[] args){
        String[] w={"bat","tab","cat"};

        for(int i=0;i<w.length;i++)
            for(int j=0;j<w.length;j++)
                if(i!=j&&pal(w[i]+w[j]))
                    System.out.println(i+" "+j);
    }
}
