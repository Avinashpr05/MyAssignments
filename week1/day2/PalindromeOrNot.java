package assignment.week1.day2;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int num = 55255;
		int temp = num;
		int sum = 0;
		while (num>0) {
			int rem = num%10;
			sum = (sum * 10) + rem;
			System.out.println(sum);
			num = num/10;

			while (num == 0){
				if (temp==sum) {
					System.out.println("It is a Palindrome");
					break;
				}
				else {
					System.out.println("It is not a Palindrome");
					break;
				}
			}
		}
	}
}
