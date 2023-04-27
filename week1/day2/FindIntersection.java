package assignment.week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int [] a = {3,2,11,4,6,7};
		int [] b = {1,2,8,4,9,7};
		int [] c = new int[a.length];
		// System.out.println(c[1]);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				while (a[i]==b[j]) {
					c[i] = a[i];
					System.out.print(c[i]+",");
					break;
				}
			}
		}
		// System.out.println(c[1]);
	}
}
