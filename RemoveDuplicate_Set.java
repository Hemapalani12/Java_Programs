package javaprgms;

import java.util.LinkedHashSet;

public class RemoveDuplicate_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online

		
		String given = "developer";
		LinkedHashSet<Character> data = new LinkedHashSet<>();
		for (char ch : given.toCharArray())

		{
			data.add(ch);
		}
		for (char ch1 : data) {
			System.out.print(ch1);
		}
	}

}
