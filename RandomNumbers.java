package javaprgms;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int rand_int= rand.nextInt();
		System.out.println(rand_int);
		double rand_double = rand.nextDouble();
		System.out.println(rand_double);
		
		

	}

}
