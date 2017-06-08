import java.util.Scanner;
{
 public class NumberofDigits {
	int Count = 0;
	public int DigitsCount(int Number) {
		if(Number > 0)
                {
		Count = Count + 1; 
		DigitsCount(Number / 10);
		}
	return Count;
}
}
}