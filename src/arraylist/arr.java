package arraylist;

import java.util.ArrayList;

public class arr {

	public static void main(String[] args) {
		
		ArrayList<Integer>number=new ArrayList<Integer>();
		System.out.println(number.size());
		number.add(10);
		number.add(50);
		number.add(1, 80);
		System.out.println(number);
		number.remove(0);
		System.out.println(number);
		number.clear();
		boolean b = number.isEmpty();
		boolean c = number.contains(50);
		int d = number.indexOf(50);
	Integer e = number.set(1, 90);
		System.out.println(b);
		System.out.println(c);
		System.err.println(d);
		System.err.println(e);
		

	}

}
