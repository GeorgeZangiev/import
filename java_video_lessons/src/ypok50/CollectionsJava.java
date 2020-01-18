package ypok50;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CollectionsJava {
	public static void main(String args[]) {
		Collection collection = new ArrayList();
		collection.add("coke");
		collection.add("pepsi");
		collection.add("sprite");
		collection.remove("pepsi");
		
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	System.out.println("----------------------------------------------------------------------------------------");
		
		for (Object obj : collection) {
			System.out.println(obj);
		}
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.set(0, "55"); 
		
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		Queue queue = new PriorityQueue();
		queue.offer("ford");
		queue.offer("ferarri");
		queue.offer("volvo");
		for (int i=0; i<queue.size(); i++) {
			System.out.println(queue.peek());
		}
		System.out.println("number of elements " + queue.size());
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		Iterator iterator2 = queue.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		Set set = new HashSet();
		set.add("apple");
		set.add("peach");
		set.add("apple");
		set.add("pear");
		set.remove("peach");
		for (Object o : set) {
			System.out.println(o);
		}
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		Map map = new HashMap();
		map.put("1", "Dan Brown");
		map.put("2", "Karnegi");
		map.put("3", "Jack London");
		System.out.println(map.get("2"));
		
	}
}

//HashSet(); - неупорядоченная коллекция
//LinkedHashSet(); - упорядоченная коллекция (порядок, установленный автором кода)
//TreeSet(); - отсортированнная коллекция (порядок, установленный компьютером) 