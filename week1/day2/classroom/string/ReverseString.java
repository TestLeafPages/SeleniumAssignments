package week1.day2.classroom.string;

public class ReverseString {
	
public static void main(String[] args) {
		
		String test = "feeling good";
       char[] charArray = test.toCharArray();
       int length = test.length();
       for (int i = length-1; i >=0; i--) {
		System.out.println(charArray[i]);
		
	}

}
