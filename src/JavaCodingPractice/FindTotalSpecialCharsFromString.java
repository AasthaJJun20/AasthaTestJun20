/*Count total special characters like _ , [ { ] } from every word, do not use any loop.
Hint : Use replace method [Think about it, how it can help].

Input :  Kr[i{s]hn}_a,Tech
Output : total special characters are 6 */

package JavaCodingPractice;

public class FindTotalSpecialCharsFromString {
	public static void main(String[] args) {
		new FindTotalSpecialCharsFromString().displayTotalSpecialCharsFromString("Kr[i{s]hn}_a,Tech");
	}

	private void displayTotalSpecialCharsFromString(String input) {
		System.out.println("Total Secial chars are : " + (input.length() - ((input.replace("[", "").replace("{", "").replace("]", "")
				.replace("}", "").replace("_", "").replace(",", "")).length())));
	}
}
