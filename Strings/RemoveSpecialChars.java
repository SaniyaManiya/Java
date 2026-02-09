public class RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "Ja@va#123!";
        String result = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("After Removal: " + result);
    }
}
