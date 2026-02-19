public class RainWater {
    public static void main(String[] args){
        int[] h={0,1,0,2,1,0,1,3,2,1,2,1};

        int l=0,r=h.length-1,left=0,right=0,res=0;

        while(l<r){
            if(h[l]<h[r]){
                left=Math.max(left,h[l]);
                res+=left-h[l++];
            }else{
                right=Math.max(right,h[r]);
                res+=right-h[r--];
            }
        }

        System.out.println(res);
    }
}
