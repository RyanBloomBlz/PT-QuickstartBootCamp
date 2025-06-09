package Week05OOPLab;

public class AsteriskLogger {
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
}
