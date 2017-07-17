import java.io.*;
import java.util.*;
class Fibonacci_series
{
public static void main(String[] args){
int a=0,b=1,z,c;
Scanner in=new Scanner(System.in);
System.out.println("Enter the range values");
c=in.nextInt();
for(int i=0;i<c;i++){
z=a+b;
a=b;
b=z;
System.out.println(z);
}
}
}