package javaprgms;

public class CountFreqOfSpecificCharc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data= "programming";
		char data1 = 'm';
		int count=0;
		
		for (char c : data.toCharArray()) {
			 
			if(c==data1)
			{
				count++;
				break;
			}
			
			
		}
		
		System.out.println(count);

	}

}
