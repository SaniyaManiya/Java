public class SumEvenOdd{
  public static void main(String[]args){
    int evensum=0;
    int oddsum=0;
    for(int i=1;i<=10;i++){
      if(i%2==0){
        evensum = evensum + i;
      }else{
        oddsum = oddsum + i;
      }
    }
      System.out.println("Sum of Even no ="+ evensum);
      System.out.println("Sum of Odd no ="+ oddsum);
    }
  }
