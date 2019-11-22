package ypok24;

import java.io.IOException;
import java.io.FileNotFoundException;

class Parent {
	protected synchronized static Parent method() throws IOException {
		return new Parent();
	}
}

class Child{
	public static Child method() throws FileNotFoundException {
		return new Child();
	}
}

public class OverrideExample {
	public static void main(String[] args) throws Exception {
		Parent parent = new Parent();
		Child child = new Child();
		
		System.out.println(Parent.method());
		System.out.println(Child.method());
	}

}
