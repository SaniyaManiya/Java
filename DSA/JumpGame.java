public class JumpGame {
    public static void main(String[] args){
        int[] a={2,3,1,1,4};
        int reach=0;

        for(int i=0;i<a.length;i++){
            if(i>reach){System.out.println(false);return;}
            reach=Math.max(reach,i+a[i]);
        }
        System.out.println(true);
    }
}
