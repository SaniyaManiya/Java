public class MajorityElement {
    public static void main(String[] args){
        int[] a={2,2,1,1,2,2,2};

        int count=0,candidate=0;

        for(int x:a){
            if(count==0) candidate=x;
            count+= (x==candidate)?1:-1;
        }

        System.out.println(candidate);
    }
}
