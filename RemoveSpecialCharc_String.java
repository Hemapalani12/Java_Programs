package javaprgms;

public class RemoveSpecialCharc_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data ="%J&*@A@%V@^A";
		String replacedData= data.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replacedData);
	}

}
