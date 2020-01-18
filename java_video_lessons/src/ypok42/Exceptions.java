package ypok42;

import java.io.File;

public class Exceptions {

	public static void main(String[] args) throws Throwable {
		new Exceptions().someMethod();
	}
void someMethod() throws Throwable {
	File file = new File("");
	file.createNewFile();
}
	
}
