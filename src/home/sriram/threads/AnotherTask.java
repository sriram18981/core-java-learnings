package home.sriram.threads;

public class AnotherTask implements Runnable {

	private volatile Person person;
	
	public AnotherTask(Person person) {
		this.person = person;
	}


	@Override
	public void run() {
		
		
		System.out.println("doing something now from another task....");
		synchronized (person) {
	        int i = 0;
	        while (i < 1000) {
	            person.setAge(person.getAge() + i);
	            i++; 
	        }
	       person.notifyAll(); 
	    } 
		
		System.out.println("doing something now from another task...." + person);

	}

}
