package guvi;
import java.util.Scanner;
public class noofLine {
	public static void main(String[] args){
		System.out.println("Enter the paragraph");
		Scanner scan=new Scanner(System.in);
		String li=scan.nextLine();
		int Count=0;
		scan.close();
		String[] sentenceList = li.split("[!?.:]+");
        Count += sentenceList.length;
		System.out.println(Count);
	}
}
