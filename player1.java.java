import java.util.*;
 
class ReverseString
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int k = length - 1 ; k >= 0 ; k-- )
         reverse = reverse + original.charAt(k);
 
      System.out.println("Reverse of entered string is: "+reverse);
   }
}
