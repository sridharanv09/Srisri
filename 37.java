public class Swap {
 
public static void main(String args[]) {
int c = 89, d = 90;
System.out.println("Before swapping:");
 
System.out.println("A=" + c);
System.out.println("B=" + d);
 
c = c ^ d; 
d = c ^ d; 
c = c ^ d; 
 
System.out.println("After swapping:");
System.out.println("A=" + c);
System.out.println("B=" + d);
}
}