package javaprgms;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="programming";
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<data.length();i++) //length=10 since i we initialize as 0 i<10 which will execute till 9
		{
			char c = data.charAt(i);
			int data1 = data.indexOf(c, i+1); //ch a character (Unicode code point).fromIndex the index to start the search from.
			
			/*Returns:
the index of the first occurrence of the character in the character sequence represented by this object that is greater than or equal to fromIndex, 
or -1 if the character does not occur.*/
			
			if (data1==-1)
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
		
		char c[]= data.toCharArray();
		Map<Character,Integer> num= new HashMap<Character,Integer>();
				  
	    for (char d : c) {
			
	    	if(num.containsKey(d))
	    	{
	    		
	    		int a= num.get(d);
	    		num.put(d, a+1);
	    		System.out.println("duplicate value" +d);
	    		
	    	}
	    	else
	    	{
	    		num.put(d, 1);
	    		System.out.println(" not duplicate value "+d);
	    	}
		}
	}

}
