package JavaCodingPractice;
/*
To print first n Fibonacci Numbers.
Input n = 5
Output = 1 1 2  3  5  8 

Input: n = 10 
Output :  1 1 2  3  5  8 13  21 34 55
*/
public class FibonacciSries {
	void printFibonacciSeries(int num) {
		int next = 1, prev = 0, add = 0;
		for(int index = 1; index <= num; index++) {
			System.out.println(next);
			add = next + prev;
			prev = next;
			next = add;
		}
	}
	public static void main(String[] args) {
		new FibonacciSries().printFibonacciSeries(10);
	}
}
