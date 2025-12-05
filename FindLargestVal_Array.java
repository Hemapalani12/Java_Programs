package javaprgms;

public class FindLargestVal_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] arraynum= {1045,675,345,789,345,234,876,923,1032};
 int largest= Integer.MIN_VALUE;
 for(int i=0;i<=arraynum.length-1;i++) 
 {
	 if(largest<arraynum[i])
	 {
		 largest=arraynum[i];
	 }
 }
 System.out.println("largest number is: "+largest);
	}

}
