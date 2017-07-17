import java.io.*;
class count
{
void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
System.out.println("enter the String");
String s=br.readLine();
int b,l,c1=0,c2=0,c3=0,sp=0;
char ch;
l=s.length();
for(b=0;b<l;b++)
{
ch=s.charAt(b);
if(Character.isLetter(ch))
++c1;
else if(Character.isDigit(ch))
++c2;
else if(ch==' ')
++sp;
else
++c3;
}
System.out.println("no of Symbol="+c3);
}
}