package com.lti.exceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

import com.day3.Objectclass.Person;

public class ExampleOnList {

	// Angular brace is called as Generics in Java
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".NET");
		list1.add("PHP");
		list1.add(1,"Java");
		// list1.add(1000);

		// 1sr is the fastest of all
		System.out.println("Option 1:old fashioned for loop");
		for (int i = 0; i < list1.size(); i++)
			System.out.println(list1.get(i));

		System.out.println("Option 2:for each loop");
		for (String str : list1)
			System.out.println(str);

		System.out.println("Option 3:Java 8 lambadad style for -each");
		list1.forEach(str -> System.out.println(str));

		System.out.println("Option 4:Traditional Iterator");
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<Person> list2 = new ArrayList<>();
		list2.add(new Person("RP", 100));
		list2.add(new Person("RP1", 1001));
		
		list2.clear();
		
		System.out.println("TO Array:");
		list1.toArray();
		
		// for(int i=0;i<list2.size();i++)
		// System.out.println(list2.get(i));
		for (Person p : list2) {
			System.out.println(p);
		}
		Iterator<Person>it2=list2.iterator();
				while (it2.hasNext()) {
					System.out.println(it2.next());
				}
				
				List<String> list3=new ArrayList<>();
				list3.addAll(list1);
				list3.add("MAWA");
			

				for (String str3 : list3)
					System.out.println(str3);
	}

}
