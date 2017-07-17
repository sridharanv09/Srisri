import java.util.*;
 
public class Input
{
    public static void main(String[ ] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter some strings !");
      List<String> list = new ArrayList<String>( );
      boolean sri = true;
        while(sri)
        {
          String d = in.nextLine( );
 
            if(d.equals("")|d.equals("q"))
            {
              break;    
            }
            else
            {
              list.add(d);
            }
        }
       
    }//main ends
 
}