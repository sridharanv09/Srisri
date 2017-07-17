import acm.program.*;

public class AddingOddNumbers extends ConsoleProgram {
    public void run() {
        int d = readInt("enter a positive nunber: ");
        int total = 0;
        for (int i = 0; i < d; i++) {
            if (d == 1) {
                println(1);
            } else {
                println((i * 2) + 1);
            }
        }
    }
}
public class Solution{

    public static void print_sums(){

        int sum = 0 ;
         for(int k = 1 ; k <= 10 ; k++){
             for(int j = 1 ; j <= i; j++ ){
                sum = sum + j ;
             }
             System.out.println( sum) ;
             sum = 0 ;
         }

    }

    public static void main(String[] args)
    {
        print_sums() ;


    }
}