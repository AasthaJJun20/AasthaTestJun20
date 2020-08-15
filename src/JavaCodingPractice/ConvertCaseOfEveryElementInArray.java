package JavaCodingPractice;

import java.util.Arrays;

/*
WAP to convert case in all elements of array. 
Input : 
String[] array = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh"};

Output:
array = {"aAvRUTI", "nIkHIL","aDItI", "maHESH","aRCHAna","JAgaDEESH"};
*/
public class ConvertCaseOfEveryElementInArray {
	void displayConvertedCaseOfEveryElementInArray(String[] input) {
		System.out.println(Arrays.toString(input).replace("[", "{").replace("]", "}"));
		String[] output = new String[input.length];
		for(int index = 0; index < input.length; index++) {
			output[index] = "";
			for(int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				if(input[index].charAt(innerIndex) >= 'a' && input[index].charAt(innerIndex) <= 'z')
					output[index] += (char)(input[index].charAt(innerIndex)-32);
				else if(input[index].charAt(innerIndex) >= 'A' && input[index].charAt(innerIndex) <= 'Z')
						output[index] += (char)(input[index].charAt(innerIndex)+32);
				else
					output[index] += input[index].charAt(innerIndex);
			}
		}
		System.out.println(Arrays.toString(output).replace("[", "{").replace("]", "}"));
	}
	public static void main(String[] args) {
		String[] input = {"AaVruti", "NiKhil", "AdiTi", "MAhesh", "ArchaNA", "jaGAdeesh","aa$+|-|A"};
		new ConvertCaseOfEveryElementInArray().displayConvertedCaseOfEveryElementInArray(input);
	}
}
