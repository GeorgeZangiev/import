package ypok43;

public class Assertion_Mechanics {

	public static void main(String[] args) {
		new Assertion_Mechanics().someMethod(-4);
	}
	private void someMethod(int a) {
		assert(a>0);
		//do something with a
		System.out.println(a);
	}
}
