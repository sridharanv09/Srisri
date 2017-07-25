import java.util.*;
import java.io.*;

class Uniqueint
{
 public static void main(String[] args)
 {
   int count=0;
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner s=new Scanner(System.in);
   int c=s.nextInt();
   int[] Arr=new int[c];
   Uniqueint obj=new Uniqueint();
   System.out.println("ENTER THE ELEMENTS:");
   for(int i=0;i<c;i++)
    {
     Arr[i]=s.nextInt();
    }
    Arrays.sort(Arr);
   System.out.println("UNIQUE ELEMENT:"+obj.method(Arr,n));
 } 
 public int method(int[] Arr,int c)
   {
     int temp=0,count=0;
    for(int i=0;i<c-1;i+=2)
     {
       if(Arr[i]!=Arr[i+1])
         {  
          temp=Arr[i];
          count=1;
          break;
         }
    }
    if(count==0)
    {
    temp=Arr[Arr.length-1];
    }
      return temp;
  }
}        