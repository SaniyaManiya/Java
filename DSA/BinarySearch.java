public class BinarySearch {
    static int search(int[] arr, int key){
        int l=0, r=arr.length-1;

        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a={1,3,5,7,9};
        System.out.println(search(a,7));
    }
}
