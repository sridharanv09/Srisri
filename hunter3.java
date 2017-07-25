import java.util.*;
import java.io.*;

class Index
{
 public static void main(String[] args)
 {
  System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
  Scanner d=new Scanner(System.in);
  int n=d.nextInt();
  Index obj=new Index();
  int[] Arr=new int[n];
  System.out.println("ENTER THE ELEMENTS:");
  for(int i=0;i<n;i++)
    {
     Arr[i]=d.nextInt();
    }
  int[] Ascending=obj.toAscending(Arr,n);
  System.out.println(">>>>>>Ascending Order>>>>>>");  
  for(int x:Ascending)
     System.out.println(x);
  for(int i=0;i<n;i++)
   {
     if(Ascending[i]==i)
       System.out.println("ELEMENT MATCHING WITH INDEX VALUE IS:"+i);
   }
  }
  public int[] toAscending(int[] A,int n)
  {
    int temp;
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
       {
         if(A[j]>A[j+1])
          {
            temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp; 
           }
        }
     }
     return A;

  }
}