package learnings.sriram.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTester {

	public static void main(String args[]) {
		List<Person> persons = initPersonsList();
		
		Collections.sort(persons);
		System.out.println(persons);
		
		Collections.sort(persons, new PersonComparator("name"));
		
		System.out.println(persons);

	}

	private static List<Person> initPersonsList() {
		List<Person> persons = new ArrayList<>(10);
		persons.add(new Person(10, "abc"));
		persons.add(new Person(30, "aqw"));
		persons.add(new Person(45, "wer"));
		persons.add(new Person(23, "wsd"));
		persons.add(new Person(78, "cde"));
		persons.add(new Person(21, "gtr"));
		persons.add(new Person(76, "trf"));
		persons.add(new Person(13, "juy"));
		return persons;
	}

}
