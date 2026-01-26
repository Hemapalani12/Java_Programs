package javaprgms;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 20, 30, 50, 60, 40, 10 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i]>secondLargest)
			{
				secondLargest=arr[i];
			}
		}
		if(secondLargest==Integer.MIN_VALUE)
		{
			  System.out.println("Second largest element not found");
		}
		else {
            System.out.println("Second largest element: " + secondLargest);
        }

	}

}
