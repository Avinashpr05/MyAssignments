package assignment.week1.day2;

public class PrimeNumber {


	public static void main(String[] args) {
		int input = 121;
		int a = input/2;
		boolean flag = true;

		for (int i = 2; i <= a; i++) {
			if(input %i ==0) {
				System.out.println("Not a Prime");
				break;				
			}

			else {
				flag = false;
				if (i == a && flag == false) {
					System.out.println("Prime");
				}
			}

		}

	}

}
