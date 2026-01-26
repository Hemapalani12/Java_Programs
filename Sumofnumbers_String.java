package javaprgms;

public class Sumofnumbers_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="45hgfjgkj879";
int sum=0;
for(int i=0;i<=str.length()-1;i++)
{
	char ch=str.charAt(i);
	if(Character.isDigit(ch))
	{
		sum+=Character.getNumericValue(ch);
	}
}
System.out.println(sum);
	}

}
