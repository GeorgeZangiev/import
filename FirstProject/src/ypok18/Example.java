package ypok18;

public class Example {
	private int speed;
	void addI(long l, int... a) {
		speed = speed + 3;
	}
	static boolean method() {
		return false;
	}
}

class OtherExample extends Example {
	public static void main(String[] args) {
		System.out.println(Example.method());
	}
}