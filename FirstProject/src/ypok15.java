
public interface ypok15 extends IOtherInterface {
	public static final int SOME_VARIABLE = 5;
	int i = 5;
	void addTwoDigits(int one, int two);
}

interface IOtherInterface{
	void someMethod();
}

interface Bounceable{
	void bounce();
}

class Example implements ypok15, IOtherInterface, Bounceable{
	@Override 
	public void addTwoDigits(int one, int two) {
		}
	public void someMethod() {
		}
	public void bounce() {
		
	}
}