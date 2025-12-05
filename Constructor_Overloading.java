package javaprgms;

public class Constructor_Overloading {

	String name;
	int age;

	public Constructor_Overloading(String name) {
		System.out.println("String paramter constructor");
		this.name = name;

	}

	public Constructor_Overloading(int age, String name) {
		System.out.println("int & String paramter constructor");
		this.name = name;
		this.age = age;

	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor_Overloading obj= new Constructor_Overloading();
		Constructor_Overloading obj1 = new Constructor_Overloading("Hema");
		obj1.display();
		Constructor_Overloading obj2 = new Constructor_Overloading(26, "devi");
		obj2.display();
	}

}
