package javaprgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Araylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ARRAYLIST: ");
		System.out.println("INSERTION ORDER MAINTAINED, DUPLICATE ALLOWED, NULL VALUE ALLOWED, DEFAULT SIZE IS 10");
		System.out.println("LINKEDLIST: ");
		System.out.println("LINKEDLIST IS BEST FOR INSERTING AND DELETING, ELEMENTS ARE NOT STORED IN CONSICUTIVE ORDER");
		//Adding elements to the array list
		ArrayList <Object> al= new ArrayList<Object>();
		al.add("hema");
		al.add(101);
		al.add('A');
		
		
		System.out.println(al);
		
		//setting and removing values
		al.set(0, "ravi");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		ArrayList <Integer> al_child = new ArrayList <Integer>();
		al_child.add(102);
		al_child.add(103);
		al_child.add(104);
		al.addAll(al_child); //adding the al_child to arraylist al
		System.out.println(al);
		
		al.removeAll(al_child); //removing all the al_child values from arraylist al
		System.out.println(al);
		System.out.println(al.size()); // printing size of the list
		System.out.println(al.getLast()); // gets the last value
		System.out.println(al.contains(101)); // searches for the elements and returns true if exist
		al.addAll(al_child);
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i)+" ");
		
		}
		System.out.println("");
		
		
		for(Object e: al_child)
		{
			System.out.println(e);
		}
		System.out.println("");
		
		Iterator<Integer> it=al_child.iterator();
		System.out.println("iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
		
		//converting int array to arraylist
		int arr[] ={10,20,30,40};
		
		ArrayList<Integer> al_convert= new ArrayList <Integer>();
		for(int data:arr)
		{
			al_convert.add(data);
		}
		System.out.println(al_convert);
		
		
		// converting string array to arraylist
		String data[]= {"Hema","Ramya","divya","ravi"};
		ArrayList<String>al_str= new ArrayList<String>(Arrays.asList(data));	
		System.out.println(al_str);
		
		//sorting in ascending and descending
		System.out.println(al_child);
		Collections.sort(al_child);
		System.out.println("ascending order: "+al_child);
	
		Collections.sort(al_child,Collections.reverseOrder()); //- Collections.reverseOrder() does not take a list as an argument.
        System.out.println("Descending order" +al_child);
        
        Collections.shuffle(al_child); // shuffling the arraylist
        System.out.println(al_child);
	}

}
