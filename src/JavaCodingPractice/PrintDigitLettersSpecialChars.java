package JavaCodingPractice;
/*
Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
public class PrintDigitLettersSpecialChars {
	void displayDigitLettersSpecialChars(String input) {
		int countDigit = 0, countUpperCase = 0, countLowerCase = 0, countSpecialChar = 0;
		for(int index = 0; index < input.length(); index++) {
			if(Character.isUpperCase(input.charAt(index)))
				countUpperCase++;
			else if(Character.isLowerCase(input.charAt(index)))
				countLowerCase++;
			else if(Character.isDigit(input.charAt(index)))
				countDigit++;
			else
				countSpecialChar++;
		}
		System.out.println("Upper case : " + countUpperCase);
		System.out.println("Lower case : " + countLowerCase);
		System.out.println("Digits : " + countDigit);
		System.out.println("Special Characters : " + countSpecialChar);
		System.out.println("Letters : " + (countLowerCase+countUpperCase));
	}
	
	public static void main(String[] args) {
		new PrintDigitLettersSpecialChars().displayDigitLettersSpecialChars("1rRpd3F9#K(E");
	}
}
