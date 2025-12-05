package javaprgms;

import java.util.Random;

public class RandomAlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length=12;
		String RandString=generateAlphaNumeric(length);
		System.out.println("Random string is: "+RandString);
	}

	public static String generateAlphaNumeric(int length)
	{
		String chars= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder res= new StringBuilder();
		Random rand= new Random();
		
		for(int i=0;i<length;i++)
		{
			res.append(chars.charAt(rand.nextInt(chars.length())));
		}
		
		return res.toString();
	}
}
