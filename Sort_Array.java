package javaprgms;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myArray= {7,5,8,4,9,3,2};
Arrays.sort(myArray);
Integer[] myArray1= {7,5,8,4,9,3,2};
Arrays.sort(myArray1,Collections.reverseOrder());;
System.out.println("Sorted in Ascending order: "+Arrays.toString(myArray));
System.out.println("Sorted in Descending order: "+Arrays.toString(myArray1));

}
}
