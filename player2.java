import java.util.Scanner;
 
class ReverseNumber
{
   public static void main(String args[])
   {
      int s, reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      s = in.nextInt();
 
      while( s != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + s%10;
          s = s/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
}