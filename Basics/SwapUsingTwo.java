public class SwapUsingTwo{
  public static void main(String args[]){
    int a = 5;
    int b = 10;
    System.out.println("Before Swap , a = " + a + " and b = " + b);
    a = a + b;
    a = a - b;
    b = a - b;
    System.out.println("After Swap , a = " + a + " and b = " + b);
  }
}
