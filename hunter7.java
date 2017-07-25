import java.util.*;
import java.util.Scanner;
public class Unique
 {
public static void main(String ar[])throws Exception
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
int ar1[]=new int[a];
for(int i=0;i<a;i++)
ar1[i]=sc.nextInt();
for(int i=0;i<a;i++)
{
b=ar1[i];
for(int j=i+1;j<a;j++)
{
if(b==ar1[j])
System.out.println("first repeated integer is:"+b);
break;
}
}
}
}