import java.util.Scanner;

class group{
public static void main(String argn[]){
Scanner data = new Scanner(System.in);
int num, l, temp, max;

System.out.print("Enter number you want to enter:");
num = data.nextInt();
System.out.println("Enter " +num+ " number");

max = data.nextInt();

for (l=1; l < num; l++) { temp = data.nextInt();
 if(temp < max)
continue;
else

max = temp;
}
System.out.println("Largest Number is "+max);
}
}
