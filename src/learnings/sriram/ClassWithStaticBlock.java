package learnings.sriram;

public class ClassWithStaticBlock {

	private static ClassWithStaticBlock instance;
	
	private  ClassWithStaticBlock() {
		System.out.println("instantiated");
	}

	static  {
		instance = new ClassWithStaticBlock();
		
	}

	public static ClassWithStaticBlock getInsance() {
		return instance;
	}

}
