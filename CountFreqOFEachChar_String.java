package javaprgms;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOFEachChar_String {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  String data="programming";
		  System.out.println(data);
		  Map<Character,Integer>map = new HashMap<Character, Integer>();
		  for (char c : data.toCharArray()) // converts String to character array to iterate
		  {
			if(!map.containsKey(c)) //check that map doesnt contain the value already
			{
				map.put(c, 1); // if it is not there then put the value as 1
			}
			else
			{
				int num= map.get(c); //so if the character is already present get the value
				map.put(c,num+1); // again put the value by mentioning num+1
			}
		}

		  System.out.println(map);
	}

}
