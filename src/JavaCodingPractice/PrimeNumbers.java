package JavaCodingPractice;
/*Create a class to satisfy below requirements. 
                  a) Given number is prime or not. 
                  b) Print total count of prime numbers between 2->100.
                  c) Find sum of all prime numbers between 2->100
                  d) Find avg of prime numbers between 2->100*/

public class PrimeNumbers {
	private boolean isPrimeNumber(int input) {
		for(int index = 2; index <= Math.sqrt(input); index++) {
			if(input%index == 0)
				return false;
		}
		return true;
	}
	
	void displayCountOfPrimeNumbersInRange(int start, int end) {
		int count = 0, sum = 0;
		for(int index = start; index <= end; index++) {
			if(isPrimeNumber(index)) {
				count++;
				sum += index;
			}
		}
		System.out.println("Total Prime Numbers are : " + count);
		System.out.println("Sum of all the prime nos. in given range : " + sum);
		System.out.println("Avg of prime Nos. in given range : " + (sum/count));
	}
	public static void main(String[] args) {
		int num = 35;
		if(new PrimeNumbers().isPrimeNumber(num) == true)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
		new PrimeNumbers().displayCountOfPrimeNumbersInRange(2, 100);
	}
}
