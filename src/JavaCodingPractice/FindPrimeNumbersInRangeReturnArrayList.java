package JavaCodingPractice;

import java.util.ArrayList;

public class FindPrimeNumbersInRangeReturnArrayList {
	ArrayList<Integer> getPrimeNumbers(int start, int end) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int index = start; index <= end; index++) {
			boolean flag = true;
			for (int innerIndex = 2; innerIndex <= Math.sqrt(index); innerIndex++) {
				if (index % innerIndex == 0)
					flag = false;
			}
			if (flag == true)
				al.add(index);
		}
		return al;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new FindPrimeNumbersInRangeReturnArrayList().getPrimeNumbers(1, 100);
		System.out.println(al);
	}
}
