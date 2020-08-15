package JavaCodingPractice;
/*Program 3: WAP to reverse number (Consider Input as Integer not as String).
Example:-
Input:- 12345
Output:- 54321*/
public class ReverseOfANumber {
	int displayReverseOfANumber(int input) {
		int rev = 0;
		while(input > 0) {
			rev = (rev*10) + (input%10);
			input /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		int rev = new ReverseOfANumber().displayReverseOfANumber(12345);
		System.out.println(rev);
	}
}
