package guvi;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the year");
		n=in.nextInt();
		if((n%2==0) &&(n%100!=0))
		{
			System.out.println("this is leap year");
		}
		else if(n%100==0)
		{
			System.out.println("this is not a leap year");
		}
		else if(n%400==0){
			System.out.println("is leap year");
		}
		else
		{
			System.out.println("this is not a leap year");
		}
	}
}