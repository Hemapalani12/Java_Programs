package javaprgms;

public class RemoveWhitespaces_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data="Au to mation Test ing";
String newData = data.replaceAll("\\s", ""); // "\\s" denotes whitespaces
System.out.println(newData);
	}

}
