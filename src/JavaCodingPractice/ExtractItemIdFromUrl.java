package JavaCodingPractice;
/*
 * Extract ItemId from below input

String input = https://www.facebook.com/technocredits/itemId=12345/
String input = https://www.facebook.com/technocredits/empid=123&itemId=12345/
String input = https://www.facebook.com/technocredits/itemId=12345&empid=123/
String input = https://www.facebook.com/technocredits/empid=123/

Output : 
item id is 12345 
        OR
no item id present.
 * */
public class ExtractItemIdFromUrl {
	void displayItemId(String input) {
		if(input.contains("itemId")) {
			String temp = input.substring(input.indexOf("itemId"));
			temp = temp.substring(temp.indexOf("="));
			String itemId = "";
			for(int index = 1; index < temp.length(); index++) {
				if(temp.charAt(index) >= '0' && temp.charAt(index) <= '9')
					itemId += temp.charAt(index);
				else
					break;
			}
			System.out.println(itemId);
		}
		else
			System.out.println("no item id present");
	}
	public static void main(String[] args) {
		ExtractItemIdFromUrl extractItemIdFromUrl = new ExtractItemIdFromUrl();
		extractItemIdFromUrl.displayItemId("https://www.facebook.com/technocredits/itemId=12345/");
		extractItemIdFromUrl.displayItemId("https://www.facebook.com/technocredits/empid=123&itemId=12345/");
		extractItemIdFromUrl.displayItemId("https://www.facebook.com/technocredits/itemId=12345&empid=123/");
		extractItemIdFromUrl.displayItemId("https://www.facebook.com/technocredits/empid=123/");
	}
}
