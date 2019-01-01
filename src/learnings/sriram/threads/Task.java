package learnings.sriram.threads;

public class Task implements Runnable {

	private Person person;
	ThreadLocal<Double> threadLocalValue = new ThreadLocal<>();
	Double local;

	public Task(Person person) {
		this.person = person;
	}

	@Override
	public void run() {

		try {
			synchronized (person) {
				if (person.getAge() < 100000) {
					person.wait();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("out of waiting.... "+ person);
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
