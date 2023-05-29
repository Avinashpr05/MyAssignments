package assignment.week3.day2.java_collections;

import java.util.ArrayList;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		ArrayList<Integer> dSet = new ArrayList<Integer>();
		for (int i: data) {
			dSet.add(i);
		}

		System.out.println(dSet.get(dSet.size()-1));

	}
}

