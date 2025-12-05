package javaprgms;

public class Methodtypes {
	
	public void Method1()
	{
		System.out.println("Method with no return type & param");
	}
	
	public String Method2()
	{
		String data ="Method returning string without param";
		return data;
		
	}
	
	public void Method3(String name)
	{
		System.out.println("Method with no return but have param");
		System.out.println(name);
	}
	
	public int Method4(int a)
	{
		System.out.println("method with both return type and param");
		a++;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodtypes type = new Methodtypes();
		type.Method1();
		System.out.println(type.Method2());
		String input="Java methods";
		type.Method3(input);
		int num=type.Method4(3);
		System.out.println(num);
	}

}
