package learnings.sriram.interfaces;


@FunctionalInterface
public interface IThirdInterface extends IFirstInterface, ISecondInterface {
	
	default void defaultFromThirdInterface() {
		System.out.println("From the Third Interface");
	}

}
