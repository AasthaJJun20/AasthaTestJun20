package JavaCodingPractice;

import java.util.Arrays;

/*
 * Replace second last globant with Technocredits. 
input-> Hi Globant Hello Globant Hi Globant GM Globant Hi Globant

output->  Hi Globant Hello Globant Hi Globant GM Technocredits Hi Globant
*/
public class ReplaceSecondLastGlobantWithTechnocredits {
	void replaceSecondLastGlobantWithTechnocredits(String input) {
		String temp = input.substring(input.lastIndexOf("Globant"));
		String temp1 = input.substring(0,input.lastIndexOf("Globant")); //Hi Globant Hello Globant Hi Globant GM Globant Hi 
		String temp2 = temp1.substring(0,input.lastIndexOf("Globant")) + "Technocredits "; //Hi Globant Hello Globant Hi Globant GM Globant Hi Technocredits
		input = temp2 + temp;
		System.out.println(input);
	}
	
	void replaceSecondLastGlobantWithTechnocreditsSuingLoop(String input) {
		System.out.println(input);
		String[] arr = input.split(" ");
		int count = 0;
		for(int index = arr.length-1; index >= 0; index--) {
			if(arr[index].equals("Globant")) {
				count++;
				if(count == 2) {
					arr[index] = "Technocredits";
					break;
				}
			}
		}
		input = Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", " ");
		System.out.println(input);
	}

	public static void main(String[] args) {
		/*new ReplaceSecondLastGlobantWithTechnocredits()
				.replaceSecondLastGlobantWithTechnocredits("Hi Globant Hello Globant Hi Globant GM Globant Hi Globant");*/
		new ReplaceSecondLastGlobantWithTechnocredits()
		.replaceSecondLastGlobantWithTechnocreditsSuingLoop("Hi Globant Hello Globant Hi Globant GM Globant Hi Globant");
	}
}
