package arraylist;

import java.util.ArrayList;

public class sortedarr {

	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		ArrayList<Integer>b=new ArrayList<Integer>();
		a.add(40);
		a.add(30);
		a.add(80);
		a.add(45);
		a.add(30);
		System.out.println(a);
		System.out.println(a.reversed());
		System.out.println(a.indexOf(45));
		System.out.println(a.contains(30));
		b.add(20);
		b.add(30);
		b.add(78);
		b.add(45);
		System.out.println(a.equals(b));

	}

}
