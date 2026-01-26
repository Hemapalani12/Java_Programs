package javaprgms;

public class Palindrome {
	public static void main(String[] args) {
        String given="testing";
        String rev="";
        
        for(int i=given.length()-1;i>=0;i--)
        {
            rev=rev+given.charAt(i);
        }
        System.out.println("reversed String "+rev);
        if(given.equalsIgnoreCase(rev))
        System.out.println("String is palindrome");
        else
        System.out.println("String is not palindrome");
        
        
    }

}
