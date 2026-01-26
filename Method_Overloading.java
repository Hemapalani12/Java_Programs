package javaprgms;

public class Method_Overloading {

	public void printData(int num)
	{
		System.out.println("Roll no: "+num);
	}
	
	public void printData(String name)
	{
		System.out.println("Student name: "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overloading obj= new Method_Overloading();
		obj.printData(102);
		obj.printData("Hemalatha");
	}

}
