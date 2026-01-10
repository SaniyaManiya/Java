public class SwapUsingSingleStatement{
  public static void main(String args[]){
    Integer a = 10;
    Integer b = 20;
    System.out.println("Before Swap , a = " + a + " and b = " + b );
    b = a + b - ( a = b );
    System.out.println("After Swap , a = " + a + " and b = " + b);
  }
}
