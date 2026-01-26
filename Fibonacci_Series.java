package javaprgms;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int given=10;
	       int a=0, b=1;
	       int c=0;
	       System.out.print(a+" "+b+" ");
	       for(int i=1;i<=given-2;i++)
	       {
	           c=a+b;
	           a=b;
	           b=c;
	           System.out.print(c+" ");
	       }
	}

}
