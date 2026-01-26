package javaprgms;

public class LargestNum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int []numbers= {20,35,57,58,60,10};
		        int largest=Integer.MIN_VALUE;
		        int SecondLarg= Integer.MIN_VALUE;
		        for(int data:numbers)
		        {
		        	if(data>largest)
		        	{
		        		SecondLarg = largest;
		        		largest=data;
		        	}
		        	else if(data>SecondLarg && data!=largest)
		        	{
		        		SecondLarg=data;
		        	}
		 
		        }
		        System.out.println("largest num= "+largest);
		        System.out.println("largest num= "+SecondLarg);
		        
		        //this if is used because if the array has only one value or all values are same this will work
		        if(SecondLarg==Integer.MIN_VALUE)
		        {
		        	System.out.println("NO SECOND LARGEST VAL");
		        }
		        else
		        {
		        	System.out.println("largest num= "+SecondLarg);
		        }
		        
		  
	}

}
