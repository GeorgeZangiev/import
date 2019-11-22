package ypok23;

class MyParent{
	MyParent(int i){
		System.out.println("My Parent Constructor");
	}
}

public class ConstructorExample2 extends MyParent {
	ConstructorExample2(){
		super(5);
		System.out.println("Constructor Example");
	}
	public static void main(String[] args) {
		new ConstructorExample2();
	}
}
