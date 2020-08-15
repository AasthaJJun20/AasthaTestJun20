package JavaCodingPractice;
/*
Program 1 :
Find Frequency of every word in a given String.
Rules:
a) Word should be compare without case sensitivity.
b) Word should be compare without special character. [use replace method]

Input = "Tech_no Hi T_EchNo H_I Tech hi_"
output : 
Frequency of every word:
              techno -> 2
              hi -> 3
              tech -> 1*/

public class FindFrequencyOfEveryWordFromString {
	void displayFrequencyOfEveryWordFromString(String input) {
		input = input.replace("_", "").toLowerCase();
		String[] arr = input.split(" ");
		for(int index = 0; index < arr.length; index++) {
			if(!arr[index].equals("*")) {
				int count = 0;
				for(int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
					if(arr[index].equals(arr[innerIndex])) {
						count++;
						if(count > 1)
							arr[innerIndex] = "*";
					}
				}
				System.out.println(arr[index] + " -> " + count);
			}
		}
	}
	public static void main(String[] args) {
		new FindFrequencyOfEveryWordFromString().displayFrequencyOfEveryWordFromString("Tech_no Hi T_EchNo H_I Tech hi_");
	}
}
