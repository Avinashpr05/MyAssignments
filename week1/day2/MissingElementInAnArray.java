package assignment.week1.day2;
import java.util.Arrays;
public class MissingElementInAnArray {

	public static void main(String[] args) {		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = 1; i <= arr[arr.length-1]; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					break;
				}
				else if ((j == 6) && (i !=j)){
					System.out.println(i);
				}
													
			}
		}
	}
}
