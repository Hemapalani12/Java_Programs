package javaprgms;

public class Prgm2_child extends Prgm3_child{

	int a;
	
	public Prgm2_child(int a2) {
		// TODO Auto-generated constructor stub
		super(a2);
		this.a=a2;
	}

	public int child1add()
	{
		int add = a+1;
		return add;
	}
	
	public int childsub() 
	{
		int sub = a-1;
		return sub;
	}
}
