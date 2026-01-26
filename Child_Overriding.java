package javaprgms;

public class Child_Overriding extends Parent_Overiding{

	public void data(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_Overiding obj=new Parent_Overiding();
		obj.data(20,30);
		
		Parent_Overiding po=new Child_Overriding();
		po.data(20, 30);
		
	}

}
