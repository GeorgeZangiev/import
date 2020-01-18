package ypok51;

import java.util.*;

class Person implements Comparable<Person>{
	private int age;
	
	public Person(int age) {
		this.setAge(age);
	}
	
	@Override
	public int compareTo(Person p) {
		return this.getAge() - p.getAge();
	}

	@Override
	public String toString() {
		return "Person's age = " + getAge();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

class ComparePerson implements	Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge()-o2.getAge();
	}
}


public class CollectionSort {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("4");
		set.add("2");
		set.add("3");
		set.add("6");
		for (Object o : set) {
			System.out.println(o);
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Set set2 = new TreeSet();
		set2.add(new Person(25));
		set2.add(new Person(37));
		set2.add(new Person(18));
		set2.add(new Person(21));
		for (Object obj : set2) {
			System.out.println(obj);
		}
		
		System.out.println("-------------------------------------------------------------------------------------------");	
		
		Set set3 = new TreeSet();
		set3.add(new Person(1864));
		set3.add(new Person(32));
		set3.add(new Person(2020));
		set3.add(new Person(154));
		for (Object ob : set3) {
			System.out.println(ob);
		}
		
	}

}
