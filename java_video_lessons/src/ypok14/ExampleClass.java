package ypok14;

public class ExampleClass {
	void method() {
		Car car = new Ferrari();
		car.Run();
		car.Stop();
	}
}

abstract class Car {
	int speed;
	abstract void Run();
	void Stop() {
		speed = 0;
	}
}
class Ferrari extends Car{
	@Override
	void Run() {
		speed = 25;
	}
}
abstract class Ball extends ExampleClass{
	
}
class MyFinalClass{
	void SomeLogin() {
		
	}
}