import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListJava {

	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new Vector();
		List linked = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0);
		System.out.println(list.size());
		System.out.println("-------------------------------------------------------------------------------------------");
		for (int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
