package assignment.week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fibN = 8;
		int fNum = 0;
		int sNum = 1;
		int sum;
		System.out.print(fNum +" ");
		System.out.print(sNum+ " ");
		
		for (int i = 0; i < fibN-2; i++) {
			sum = fNum + sNum;
			System.out.print(sum + " ");
			fNum = sNum;
			sNum = sum;
		}

	}

}
