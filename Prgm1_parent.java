package javaprgms;
import org.testng.annotations.Test;

public class Prgm1_parent {

	int a =3;
	
	@Test
	public void run() 
	{
		Prgm2_child obj= new Prgm2_child(a); //parameterized constructor
		System.out.println(obj.child1add()); // calling the method of another class with the help of object of that class
		System.out.println(obj.childsub());
		System.out.println(obj.multiprgm3());
		}

}
