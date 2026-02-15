import java.util.*;

public class ValidSudoku {
    public static void main(String[] args){
        char[][] b={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'}
        };

        HashSet<String> set=new HashSet<>();

        for(int i=0;i<b.length;i++)
            for(int j=0;j<b[0].length;j++){
                char c=b[i][j];
                if(c!='.'){
                    if(!set.add(c+"row"+i)||!set.add(c+"col"+j))
                        System.out.println(false);
                }
            }
        System.out.println(true);
    }
}
