package JavaCodingPractice;
/*Create a new method to print middle character of all words.

Input = "Harsh Maulik";
Output : r is middle character in Harsh
              u is middle character in Maulik */

public class PrintMiddleCharOfEveryWord {
	private void displayMiddleCharOfEveryWord(String input) {
		String[] arr = input.split(" ");
		for(int index = 0; index < arr.length; index++) {
			System.out.println(arr[index].charAt((arr[index].length()-1)/2) + " is the middle character of " + arr[index]);
		}
	}
	
	public static void main(String[] args) {
		new PrintMiddleCharOfEveryWord().displayMiddleCharOfEveryWord("Harsh Maulik");
	}
}
