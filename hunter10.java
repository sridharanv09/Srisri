
import java.util.*;
import java.io.*;

class Subset
{
 public static void main(String[] args)
 { 
   int count=0;  
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner d=new Scanner(System.in);
   int n=d.nextInt();
   int[] Arr=new int[n];   
   System.out.println("ENTER THE ELEMENTS OF ARRAY:");
   for(int i=0;i<n;i++)
    {
     Arr[i]=d.nextInt();
    }
    System.out.println("ENTER THE NUMBER OF ELEMENTS IN SUBSET: ");
    int m=d.nextInt();
    int[] Sub=new int[m];
    System.out.println("ENTER THE ELEMENTS OF SUBSET:");
    for(int i=0;i<m;i++)
    {
     Sub[i]=d.nextInt();
    }
   Arrays.sort(Arr);
   Arrays.sort(Sub);
   for(int i=0;i<n-m;i++)
   {
       for(int j=0;j<m;j++)
       {
            if(Arr[i]==Sub[j])
              count++;
       }
   }
   if(count==m )
     System.out.println("[[[PRESENCE OF SUBSET]]]");            
   else
    System.out.println("[[[THERE IS NO SUBSET]]]");
 }
}       