package javaprgms;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data="selenium automation";
String reversed="";
char[] array= data.toCharArray();
for(int i=array.length-1;i>=0;i--)
{
	reversed += array[i];
}
System.out.println(reversed);
	}

}
