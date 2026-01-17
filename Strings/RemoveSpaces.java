public class RemoveSpaces{
  public static void main(String args[]){
    String str = "Hello World";
    String result = " ";
    for(int i = 0; i<str.length(); i++){
      if(str.length(i) != ' ')
        result += str.charAt(i);
    }
    System.out.println(result);
  }
}
