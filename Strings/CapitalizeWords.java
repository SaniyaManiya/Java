public class CapitalizeWords {
    public static void main(String[] args) {
        String s = "hello java world";
        String[] words = s.split(" ");

        for(String w : words){
            System.out.print(w.substring(0,1).toUpperCase() + w.substring(1) + " ");
        }
    }
}
