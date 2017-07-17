package guvi;
import java.util.Scanner;
public class NumericChar {

	public static void main(String[] args) {
		String k;
		Scanner s=new Scanner(System.in);
			k=s.nextLine();
			char []ch=k.toCharArray();
			int count=0;
			for(int i=0;i<k.length();i++){
				if(((int)ch[i]>47)&& ((int)ch[i]<58)){
					count++;
				}
			
		}
			System.out.println(count);
	}

}