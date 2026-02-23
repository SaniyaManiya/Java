public class Celebrity {
    static boolean knows(int a,int b){
        return a<b;
    }

    public static void main(String[] args){
        int n=4,a=0,b=n-1;

        while(a<b)
            if(knows(a,b)) a++;
            else b--;

        System.out.println(a);
    }
}
