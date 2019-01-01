package learnings.sriram;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class SomeLearning {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ClassWithStaticBlock singleton = ClassWithStaticBlock.getInsance();
		System.out.println(ClassWithStaticBlock.getInsance());
		
		
	}

	public static void main1(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		Hashtable<String, String> table = new Hashtable<>();
		
		table.put("1", "a");
		table.put("2", "b");
		table.put("3", "c");
		
		Map<String, String> map = new Hashtable<>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		
		
		String a = "Sriram";
		String b = new String("Sriram");
		
		set.add(a);
		set.add(b);
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println(set);
		System.out.println(table);
		
		
		//Collections.synchronizedNavigableMap(map);
		
		String first = "Baeldung11"; 
		String second = "Baeldung11".intern(); 
		System.out.println(first == second); // True

	}

}
