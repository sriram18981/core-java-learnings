package home.sriram.threads;

public class ThreadTester {
	
	public static void main(String[] args) throws Exception {
		Person p1 = new Person("abc", 1);
		
		ExceptionCatcher ec = new ExceptionCatcher();
		Thread.setDefaultUncaughtExceptionHandler(ec);
		
		
		
//		AnotherTask t3 = new AnotherTask();
//		Thread th3 = new Thread(t3);
//		t3.setPerson(p1);
//		th3.setName("mno");
//		th3.start();
		
		Task t1 = new Task(p1);
		Thread th1 = new Thread(t1);
		th1.setName("abc thread");
		th1.start();
		
		AnotherTask t2 = new AnotherTask(p1);
		Thread th2 = new Thread(t2);
		th2.setName("xyz thread");
		th2.start();
		
		
		
		Thread.sleep(500);
	
		System.out.println("main thread exiting :: " + p1);
		
	
	}

}
