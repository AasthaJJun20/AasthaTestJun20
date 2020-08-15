package JavaCodingPractice;
/*
 * Print below pattern for given string "Globant"
Globant
Globan
Globa
Glob
Glo
Gl
G
 * 
 * 
 * Print below pattern for given string "Globant"
Globant
Lobant
Obant
Bant
Ant
Nt
T
 * */
public class PrintReducingGlobantString {
	void printPattern1(String input) {
		for(int index = input.length(); index >= 0; index--) {
			System.out.println(input.substring(0,index));
		}
	}
	
	void printPattern2(String input) {
		for(int index = 0; index < input.length(); index++) {
			String temp = input.substring(index,input.length());
			temp = Character.toUpperCase(temp.charAt(0)) + temp.substring(1);
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		new PrintReducingGlobantString().printPattern1("Globant");
		new PrintReducingGlobantString().printPattern2("Globant");
	}
}
