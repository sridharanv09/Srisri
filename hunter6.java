import java.util.*;
import java.io.*;

class Repeated1st
{
 public static void main(String[] args)
 {
  int num=0,count=0;
  System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
  Scanner a=new Scanner(System.in);
  int b=a.nextInt();
  int[] Arr=new int[n];
  System.out.println("ENTER THE ELEMENTS:");
  for(int i=0;i<b;i++)
   {
     Arr[i]=a.nextInt();
    }
  for(int i=0;i<b;i++)
    { 
      if(count==0)
      {
         for(int j=i+1;j<b;j++)
         {
           if(Arr[i]==(Arr[j]))
            { 
              num=Arr[i];
              count+=1;
              break;
            }
         }
       }
                
    } System.out.println("REPEATED ELEMENT:"+num); 
 }
} 