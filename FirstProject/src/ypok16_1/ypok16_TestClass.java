package ypok16_1;

public class ypok16_TestClass {
	private int i = 4;
	protected int j = 5;
	int k = 7;
	public int m = 9;
		void method() {
			ypok16_TestClass testClass = new ypok16_TestClass();
			System.out.println(testClass.i);
		}
}

class TestModifiers{
	void method() {
	ypok16_TestClass testClass = new ypok16_TestClass();
	System.out.println(testClass.m);
	}
}