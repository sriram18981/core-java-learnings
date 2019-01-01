package learnings.sriram.interfaces;

@FunctionalInterface
public interface IFirstInterface {
	
	
	default void someNewMethod() {
		System.out.println("some rubbish loggs coming from the first interface");
	}
	
	void abstractMethod();

//	public default void defaultForFirst() {
//		System.out.println("From the first interface");
//	}

//	public static void log() {
//		System.out.println("logginf from the first interface");
//	}

}
