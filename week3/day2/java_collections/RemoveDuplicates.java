package assignment.week3.day2.java_collections;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "we learn java basics as part of java sessions in java week1";
		String replace = " ";
		String[] splitWords = text.split(" ");
		//		System.out.println(splitWords[2]);
		//		System.out.println(splitWords[7]);
		//		System.out.println((splitWords[2]).equals((splitWords)[7]));

		for (int i = 0; i < splitWords.length-1; i++) {
			int count = 0;
			for (int j = i+1; j < splitWords.length; j++) {

				if ((splitWords[i]).equals(splitWords[j])) {				
					count = count + 1;
				}

			}
			if (count>0) {
				System.out.print(replace);				
			}

			else {
				System.out.print(splitWords[i] + " ");
			}


		}


	} 	

}


// a) Use the declared String text as input
// String text = "We learn java basics as part of java sessions in java week1";		
// b) Initialize an integer variable as count	  
// c) Split the String into array and iterate over it 
// d) Initialize another loop to check whether the word is there in the array
// e) if it is available then increase and count by 1. 
// f) if the count > 1 then replace the word as "" 
// g) Displaying the String without duplicate words	



