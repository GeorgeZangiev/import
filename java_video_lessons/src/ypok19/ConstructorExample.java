package ypok19;

public class ConstructorExample {
	int i;
	ConstructorExample(String hello, int i){
		this.i = i;
		System.out.println(hello);
		System.out.println("run");
	}
	ConstructorExample(){
		this.i = i;
		System.out.println("run");
	}
}

class Run{
	public static void main(String[] args) {
		ConstructorExample constructorexample = new ConstructorExample();
		System.out.println(constructorexample.i);
	}
}
