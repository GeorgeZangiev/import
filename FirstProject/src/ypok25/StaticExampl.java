package ypok25;

public class StaticExampl {
	static int i;
	static int a = 6;
	int j;
	int b = 6;
	static {
		System.out.println("static initializer");
	}
	{
		System.out.println("initializer");
	}
	{
		System.out.println("second initializer");
	}
	StaticExampl(){
		System.out.println("constructor");
	}
	static void staticMethod() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		staticMethod();
		new StaticExampl();
		new StaticExampl();
	}
}
