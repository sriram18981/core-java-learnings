package home.sriram.interfaces;

public interface ISecondInterface {
	
	default public void defaultFromSecond() {
		System.out.println("From the second Interface");
	}

	public static void log() {
		System.out.println("logginf from the second interface");
	}
}
