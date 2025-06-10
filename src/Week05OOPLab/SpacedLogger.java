package Week05OOPLab;

public class SpacedLogger implements Logger {
	String input;
	
	SpacedLogger(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public void log() {
		for (int i = 0; i < this.input.length(); i++) {
			System.out.print(this.input.charAt(i));
			System.out.print(" ");
		}
		System.out.print("\r");
	}
	
	public void error() {
		System.out.print("Error: ");
		for (int i = 0; i < this.input.length(); i++) {
			System.out.print(this.input.charAt(i));
			System.out.print(" ");
		}
		System.out.print("\r");
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
