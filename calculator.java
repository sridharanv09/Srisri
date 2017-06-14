package method;

 class calculator {
	 static  void powerInt(int num1,int num2){
		 double x=Math.pow(num1,num2);
		 System.out.println(x);
	 }
     static void powerDouble(double num1,int num2){
    	 double y=Math.pow(num1,num2);
    	 System.out.println(y);
     }
     public static void main(String args[]){
    	 
    	 calculator.powerInt(2,5);
    	 calculator.powerDouble(2,7);
     }
}
