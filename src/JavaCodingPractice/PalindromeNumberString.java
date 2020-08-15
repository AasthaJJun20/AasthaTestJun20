package JavaCodingPractice;

public class PalindromeNumberString {
	void findIfNumberIsPalindrome(int input) {
		int num = input;
		int output = 0;
		while(num > 0) {
			output = (num%10) + (output*10);
			num /= 10; 
		}
		if(input == output)
			System.out.println(input + " is Palindrome");
		else 
			System.out.println(input + " is not a Palindrome");
	}
	
	void findIfStringIsPalindrome(String input) {
		String  output = "";
		for(int index = input.length()-1 ; index >= 0 ; index--) {
			output += input.charAt(index);
		}
		if(input.equals(output))
			System.out.println(input + " is Palindrome");
		else 
			System.out.println(input + " is not a Palindrome");
	}
	
	public static void main(String[] args) {
		new PalindromeNumberString().findIfNumberIsPalindrome(121);
		new PalindromeNumberString().findIfStringIsPalindrome("abcdcba");
	}
}
