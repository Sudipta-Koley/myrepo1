package arraylist;

public class exceptionprogram {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("run successfully");
		}
		

	}

}
