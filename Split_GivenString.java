package javaprgms;

public class Split_GivenString {

	public static void main(String[] args) {
	       String given="Auto123maTION$%^";
	      String caps="",small="",digit="";
	      for(int i=0;i<=given.length()-1;i++)
	      {
	          if(Character.isUpperCase(given.charAt(i)))
	          {
	              caps+=given.charAt(i);
	          }
	          if(Character.isLowerCase(given.charAt(i)))
	          {
	              small+=given.charAt(i);
	          }
	          if(Character.isDigit(given.charAt(i)))
	          {
	              digit+=given.charAt(i);
	          }
	      }
	      System.out.println("Uppercase: "+caps);
	      System.out.println("Digits: "+digit);
	      System.out.println("Lowercase: "+small);
	    }
}
