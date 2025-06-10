package Week05OOPLab;

public class App {

	public static void main(String[] args) {

		AsteriskLogger problem = new AsteriskLogger("Boondoggle");
		SpacedLogger issue = new SpacedLogger("Hornswaggle");
		
		problem.log();
		problem.error();
		issue.log();
		issue.error();

	}

}
