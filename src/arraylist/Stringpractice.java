package arraylist;

public class Stringpractice {

	public static void main(String[] args) {
		String s = "India is my country";
		System.out.println(s.codePointAt(8));
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("m"));
		System.out.println(s.lastIndexOf("y"));
		System.out.println(s.trim());
		String[] s1 = s.split(" ");
		for(String x:s1) {
			System.out.println(x);
		}

	}

}
