package week3.day1.Classroom;

public class RemoveDuplicates {

	public static void main(String[] args) {		
		
//		Declare a String as PayPal India
String a = "PayPal India";
		
//		Convert it into a character array
char[] ch= a.toCharArray();

for(char c: ch) {
	System.out.println(c);
}

//		Declare a Set as charSet for Character
Set <Character> set = new TreeSet <Character>();

//		Declare a Set as dupCharSet for duplicate Character
Set <Character> set1 = new TreeSet <Character>();

//		Iterate character array and add it into charSet
int length = ch.length;
		
	for (char eachValue: ch) {
		


//		if the character is already in the charSet then, add it to the dupCharSet
		if(set.contains(eachValue)) {
			
			set1.add(eachValue);
		}else {
			set.add(eachValue);
		}
			}
		System.out.println(set);
		System.out.println(set1);
		
		
//		Check the dupCharSet elements and remove those in the charSet
for(char eachText: set1) {
	if(set.contains(eachText)) {
		set.remove(eachText);
	}else {
		
	}
}
	
		
//		Iterate using charSet

	for(char check: set) {
		
	
//		Check the iterator variable isn't equals to an empty space
		if(check!=' ') {
			
//		print it
		
			System.out.println("No empty space");
		}else {
			System.out.println("Empty space");
		}
	}
	
	}
}
