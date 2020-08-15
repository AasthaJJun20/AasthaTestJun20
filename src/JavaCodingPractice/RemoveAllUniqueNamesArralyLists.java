package JavaCodingPractice;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
output : [Palak, Viresh, Yash, Aavruti,Deavina,Nikhil]
 * */
public class RemoveAllUniqueNamesArralyLists {
	void display() {
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti"};
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1)); 
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil"};
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		//ArrayList<String> output = new ArrayList<String>(nameList1);
		nameList1.removeAll(nameList2);
		nameList2.addAll(nameList1);
		System.out.println(nameList2);
	}
	
	public static void main(String[] args) {
		new RemoveAllUniqueNamesArralyLists().display();
	}
}
