package javaprgms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="selenium automation";
		String reverse="";
		for(int i =sentence.length()-1;i>=0;i--) 
		{
			reverse=reverse+sentence.charAt(i);
		}
		System.out.println(reverse);
	}

}
