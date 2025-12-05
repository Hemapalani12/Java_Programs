package javaprgms;

public class PrintNumbersAlone_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1) using regEX
		System.out.println("1) using regEX");
		String data= "b4n3c6a1";
		String outputData= data.replaceAll("\\D", "");
		System.out.println(outputData);
		
		//2) using Stringbuilder method
		
		System.out.println("2) using Stringbuilder method");
		StringBuilder sb= new StringBuilder();
		for (char c: data.toCharArray())
		{
			if(Character.isDigit(c))
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}

}
