package assignment.week3.day2.java_collections;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		
		String test = "changeme";		
		char [] charArray = test.toCharArray();				
		for (int i = 0; i < charArray.length; i++) {
			if (i%2 != 0) {
				System.out.print(Character.toUpperCase(charArray[i]));				
			}
			else
				System.out.print(charArray[i]);			
		}
			
	}
}
