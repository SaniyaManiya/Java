import java.util.*;

public class MinPlatforms {
    public static void main(String[] args){
        int[] arr={900,940,950,1100,1500,1800};
        int[] dep={910,1200,1120,1130,1900,2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat=1,res=1,i=1,j=0;

        while(i<arr.length){
            if(arr[i]<=dep[j]) plat++;
            else{ plat--; j++; }
            res=Math.max(res,plat);
            i++;
        }

        System.out.println(res);
    }
}
