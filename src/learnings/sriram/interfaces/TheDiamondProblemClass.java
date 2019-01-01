package learnings.sriram.interfaces;

public class TheDiamondProblemClass implements IThirdInterface {

		public static void main(String[] args) {
			System.out.println("From the diamond problem class");
			
			TheDiamondProblemClass diamond = new TheDiamondProblemClass();
			
			diamond.defaultFromThirdInterface();
			diamond.defaultFromSecond();
			//diamond.defaultForFirst();
			//IThirdInterface.log();
		}

		@Override
		public void abstractMethod() {
			// TODO Auto-generated method stub
			
		}
}
