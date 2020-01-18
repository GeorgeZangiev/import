package ypok52;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueJava {

	public static void main(String[] args) {
		Queue queue2 = new PriorityQueue();
		Queue queue = new LinkedList();
		queue.add("a");
		queue.offer("b"); //offer=add
		queue.add("c");
		while (queue.size()>0) {
			System.out.println(queue.poll());
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		queue2.add("3");
		queue2.add("1");
		queue2.offer("8");
		while(queue2.size()>0) {
			System.out.println(queue2.poll());
		}
	}

}
