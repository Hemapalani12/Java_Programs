package javaprgms;

public class Mypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data="AJHHJ467NJM676";
int sum=0;
for(int i=0;i<=data.length()-1;i++)
{
	char ch=data.charAt(i);
	if(Character.isDigit(ch))
	{
		sum+=Character.getNumericValue(ch);
	}
}
System.out.println(sum);
	}

}
