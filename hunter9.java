import java.util.*;
import java.io.*;

class Sum
{
 public static void main(String[] args)
 {
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner a=new Scanner(System.in);
   int d=a.nextInt();
   double[] Arr=new double[n];
   System.out.println("ENTER THE ELEMENTS:");
   for(int i=0;i<d;i++)
    {
     Arr[i]=s.nextDouble();
    }
   for(int i=0;i<d;i++)
   {
       for(int j=0;j<d;j++)
       {
         if(Arr[i]+Arr[j]==0 || ((Arr[i]+Arr[j]<1)&&(Arr[i]+Arr[j]>-1)))
          System.out.println("ELEMENTS ARE:"+Arr[i]+","+Arr[j]);
       }     
   }
 }
}    