package javaprgms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Try programiz.pro");
		String given = "thalapathy vijay";
		String given1 = "jayiv palathathy";
		if (given.length() == given1.length()) {
			char c1[] = given.toCharArray();
			Arrays.sort(c1);
			char c2[] = given1.toCharArray();
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not anagram");
			}
		} else {
			System.out.println("Not anagram");
		}

	}
}
