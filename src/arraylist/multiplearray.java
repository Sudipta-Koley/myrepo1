package arraylist;

import java.util.ArrayList;

public class multiplearray {

	public static void main(String[] args) {
		ArrayList<Integer>num1=new ArrayList<Integer>();
		ArrayList<Integer>num2=new ArrayList<Integer>();
		//ArrayList<Integer>num3=new ArrayList<Integer>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(50);
		System.out.println(num1);
		num2.add(1);
		num2.add(2);
		num2.add(3);
		num2.add(4);
		System.out.println(num2);
		Object num31 = num1.clone();
		System.out.println(num31);
         System.err.println(num31.equals(num1));
	}

}
