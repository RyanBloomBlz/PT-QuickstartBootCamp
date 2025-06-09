package Week05OOPLab;

public class App implements Logger {

	public static void main(String[] args) {

		AsteriskLogger problem = new AsteriskLogger("Boondoggle");
		SpacedLogger issue = new SpacedLogger("Hornswaggle");
		
		problem.log();
		problem.error();
		issue.log();
		issue.error();

	}
	
	@Override
	public void log(String log) { // I don't get this at all and it's 3:40am, so I'm going to bed for now
	AsteriskLogger str = new AsteriskLogger(log);
	str.log();
	}

	@Override
	public void error(String error) { // I don't get this at all and it's 3:40am, so I'm going to bed for now
		AsteriskLogger str = new AsteriskLogger(error);
		str.error();
	}

}
