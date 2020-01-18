package ypok46_47;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws Exception {
		User_Child user = new User_Child();
		user.lifeLevel = 55;
		user.ChildLevel = 32;
		
		FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream("tempFile");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		User_Child newUser = (User_Child) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(newUser.lifeLevel);
		System.out.println(newUser.ChildLevel);
		
	}

}
