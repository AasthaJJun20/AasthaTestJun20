package JavaCodingPractice;
/*WAP to check if a number is Armstrong or not.
Example:-
Input:- 153
Output:-153
hint:- (1*1*1)+(5*5*5)+(3*3*3)
1+125+27
153*/
public class Amstrong {
	void findIsAmstrong(int input) {
		int result = 0;
		int num = input;
		while(num > 0) {
			result += (num%10) * (num%10) * (num%10);
			num /= 10;
		}
		if(input == result)
			System.out.println("Given number is Amstrong");
		else
			System.out.println("Given number is not Amstrong");
	}
	public static void main(String[] args) {
		new Amstrong().findIsAmstrong(153);
	}
}
