package javaprgms;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(70);
		al.add(30);
		al.add(80);
		al.add(20);
		al.remove(Integer.valueOf(80));
		al.add(2, 50);
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(60);
		al1.addAll(al);
		al1.removeFirst();
		
		for (Integer data : al1) {
			
			System.out.println(data);
		}
		
	}

}
