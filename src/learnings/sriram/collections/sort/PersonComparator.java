package learnings.sriram.collections.sort;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	private String sortBy = "name";


	public PersonComparator(String sortBy) {
		super();
		this.sortBy = sortBy;
	}


	@Override
	public int compare(Person o1, Person o2) {
		if(sortBy.equals("age")) {
			return o1.getAge() - o2.getAge();
		} else {
			return o1.getName().compareTo(o2.getName());
		}
		
	}

}
