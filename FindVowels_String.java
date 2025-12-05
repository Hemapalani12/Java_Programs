package javaprgms;

import java.util.regex.*;

public class FindVowels_String {
public static void main(String[] args) {
String regex = "[aeiouAEIOU]";
String input = "Aello World";
String foundVowels="";

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(input);

while (matcher.find()) {
foundVowels+= matcher.group();
}
System.out.println("found vowels in the string: "+foundVowels);
}
}