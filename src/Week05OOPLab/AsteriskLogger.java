package Week05OOPLab;

public class AsteriskLogger implements Logger {
	String input;
	
	AsteriskLogger(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void log() {
		System.out.println("***" + this.input + "***");
	}
	
	public void error() {
		System.out.println("****************");
		System.out.println("*** Error:" + this.input + "***");
		System.out.println("****************");
	}

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
	}
}
