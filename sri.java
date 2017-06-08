import java.util.Scanner;
public class  leap{
public static void main(String args[])
    {
       int y;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter Year : ");
       y = scan.nextInt();   
       if((y%4 == 0) && (y%100!=0)){
       System.out.print("This is a Leap Year");}
       else if(y%100 == 0){
        System.out.print("This is not a Leap Year");}
       else if(y%400 == 0)
       {
           System.out.print("This is a Leap Year");
       }
       else
       {
           System.out.print("This is not a Leap Year");
       }
    }
}