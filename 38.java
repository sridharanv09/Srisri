import java.io.*;
import java.util.*;
class Greatest_three_num
{
public static void main(String[] args)
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("Enter three values");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b&&a>b)
{
System.out.println(a+" is greatest");
} 
else if(b>a&&b>c)
{
System.out.println(b+" is greatest");
}
else if(c>a&&c>b)
{
System.out.println(c+" is greatest");
}
}
}