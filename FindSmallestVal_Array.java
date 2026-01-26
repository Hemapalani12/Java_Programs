package javaprgms;

public class FindSmallestVal_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arraynum= {56,78,98,45,30,68,28,54,32,10};
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<=arraynum.length-1;i++)
		{
			if(smallest>arraynum[i])
			{
				smallest=arraynum[i];
			}
		}
		System.out.println("smallest value is: "+smallest);
	}

}
