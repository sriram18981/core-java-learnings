package learnings.sriram.collections.sort;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTester {
	
	private static Random random = new Random();

	public static void main(String args[]) {
		listSorting();
		
		

	}
	
	private static String generateRandomString() {
		byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));
	 
	    System.out.println(generatedString);
	    return generatedString;
	}
	
	private static void listSorting() {
		List<Person> persons = initPersonsList(100);
		System.out.println(persons);
		
		Collections.sort(persons);
		System.out.println(persons);
		
		Collections.sort(persons, new PersonComparator("name"));
		
		System.out.println(persons);
	}

	private static List<Person> initPersonsList(int size) {
		List<Person> persons = new ArrayList<>(size);
		for (int i =0 ; i < size; i++) {
			persons.add(createRandomPerson());
		}
		
		return persons;
	}
	
	private static Person createRandomPerson() {
		return new Person(random.nextInt(101), generateRandomString());
	}

}
