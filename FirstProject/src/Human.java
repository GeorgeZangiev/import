import com.george.*;
public class Human {
	Car mycar;
	int age = 20;
	public static void main(String[]args) {
		Human human = new Human();
		System.out.println(human.getAge(5, 0.4, true, human));
	}
	double getAge(int i, double d, boolean bool, Human human) {
		return human.age;
	}
}
