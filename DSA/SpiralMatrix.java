public class SpiralMatrix {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};

        int top=0,bot=2,left=0,right=2;

        while(top<=bot&&left<=right){
            for(int i=left;i<=right;i++) System.out.print(a[top][i]+" ");
            top++;
            for(int i=top;i<=bot;i++) System.out.print(a[i][right]+" ");
            right--;
            for(int i=right;i>=left;i--) System.out.print(a[bot][i]+" ");
            bot--;
            for(int i=bot;i>=top;i--) System.out.print(a[i][left]+" ");
            left++;
        }
    }
}
