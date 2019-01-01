package learnings.sriram.threads;

import java.lang.Thread.UncaughtExceptionHandler;

public class ExceptionCatcher implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("from thread :: " + t.getName());
	}

}
