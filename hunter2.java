import java.util.*;
public class repeated_elements {
    public static void main(String ar[])throws Exception
{
int a,p,t;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar1[]=new int[n];
for(int i=0;i<a;i++)
ar1[i]=sc.nextInt();
for(int i=0;i<a;i++)
{
for(int j=i+1;j<a;j++)
{
if(ar1[i]>ar1[j])
{
t=ar1[i];
ar1[i]=ar1[j];
ar1[j]=t;
}
}
}
for(int i=0;i<a-1;i++)
{
if(ar1[i]==ar1[i+1])
{
    System.out.println(ar1[i]);
}
}
}
}