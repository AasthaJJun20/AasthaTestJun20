package JavaCodingPractice;
/*
Find the frequency of character from a given String array.
Note: Take String array and character from the user.
*/

public class FindFrequencyOfEachCharInString {
	void displayFrequencyOfEachCharInString(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			if (index == input.indexOf(input.charAt(index))) {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (input.charAt(index) == input.charAt(innerIndex)) {
						count++;
					}
				}
			}
			if(count > 0)
				System.out.println(input.charAt(index) + " -> " + count);
		}

	}

	public static void main(String[] args) {
		new FindFrequencyOfEachCharInString().displayFrequencyOfEachCharInString("aastha");
	}
}
