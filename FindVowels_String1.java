package javaprgms;

public class FindVowels_String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myStr = "selenium automation";
		String data = myStr.toLowerCase();
		String vowels = "";
		int count=0;
		for (int i = 0; i <= data.length() - 1; i++) 
		{
			char ch = data.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
				vowels += ch;
				count++;
				}

		}

		System.out.println("found vowels: " + vowels +" no of vowels is: "+count);
	}

}
