package JavaCodingPractice;

public class Interview2 {
	public static void main(String[] args) {
		String x = "Hi";
		String s = new String("Hi");
		StringBuffer b = new StringBuffer("Hi");
		StringBuffer d = new StringBuffer("Hi");
		StringBuilder c = new StringBuilder("Hi");
		StringBuilder e = new StringBuilder("Hi");
		System.out.println("b.equals(x) = " + b.equals(x));
		System.out.println("b.equals(c) = " + b.equals(c));
		System.out.println("b.equals(d) = " + b.equals(d));
		System.out.println(b==d);
		System.out.println("c.equals(e) = " + c.equals(e));
		System.out.println(c==e);
		System.out.println(x==s);
		System.out.println(s.equals(x));
		
	}
}
