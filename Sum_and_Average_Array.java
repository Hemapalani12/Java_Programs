package javaprgms;

public class Sum_and_Average_Array {

	public static void main(String[] args)
	{
	int[] myNum= {10,5,6,4,1};
	int sum=0;
	double average=0;
	for(int i=0;i<=myNum.length-1;i++)
	{
		sum=sum+myNum[i];
		average=(double)sum/myNum.length;
	}
	System.out.println("Sum of the array is : "+sum);
	System.out.println("average of the array is : "+average);
	}
}
