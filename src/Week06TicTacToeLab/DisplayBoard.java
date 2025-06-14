package Week06TicTacToeLab;

public class DisplayBoard {
	
	int[][] board;
	int player;
	int winner;
	int enter;
	
	DisplayBoard(int[][] board, int player, int winner, int enter) {
		this.board = board;
		this.player = player;
		this.winner = winner;
		this.enter = enter;
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public int getWinner() {
		return winner;
	}

	public void setWinner(int winner) {
		this.winner = winner;
	}
	
	public int getEnter() {
		return enter;
	}

	public void setEnter(int enter) {
		this.enter = enter;
	}

	public void display() {
		System.out.println("\r");
		System.out.println("+---+---+---+"); // Header
		
		for (int i = 0; i < this.board.length; i++) { //Row
			for (int j = 0; j < this.board[i].length; j++) { //Column
				
				System.out.print("| "); // Horizontal cell bar
				
				int space = (j + 1) + (i * 3); // What space we're on
				
				if (this.board[i][j] == 0) { // If space contains nothing, display its number.
				System.out.print(space); // Number
				} else if (this.board[i][j] == 1) { // Player 1's token
					System.out.print("X");
				} else if (this.board[i][j] == 2) { // Player 2's token
					System.out.print("O");
				}
				
				System.out.print(" "); // Add a space after the entry
				if (j == 2) {
					System.out.print("|"); // If we're at the right edge of the board, add another cell
				}
			}
			System.out.print("\r"); // Carriage return
			System.out.println("+---+---+---+"); // Footer
		}
		
		if (this.winner == 0) { // Have we declared a winner?
			System.out.print("Player "+ (this.player + 1) + ", it is your turn. Please enter a number to place an "); // Prompt the next player correctly
				if (this.player == 0) { // If it's player 1, they are an X
					System.out.print("X:");
				} else { // If it's player 2, they are an O
					System.out.print("O:");
				}
			} 
	}
	
	public int checkWinner() {
		if (this.board[0][0] == (this.player+1) && this.board[0][1] == (this.player+1) && this.board[0][2] == (this.player+1)) { // Top Horiz Row
			return this.player + 1;
		} else if (this.board[1][0] == (this.player+1) && this.board[1][1] == (this.player+1) && this.board[1][2] == (this.player+1)) { // Middle Horiz Row
			return this.player + 1;
		} else if (this.board[2][0] == (this.player+1) && this.board[2][1] == (this.player+1) && this.board[2][2] == (this.player+1)) { // Bottom Horiz Row
			return this.player + 1;
		} else if (this.board[0][0] == (this.player+1) && this.board[1][0] == (this.player+1) && this.board[2][0] == (this.player+1)) { // Left Vert Column
			return this.player + 1;
		} else if (this.board[0][1] == (this.player+1) && this.board[1][1] == (this.player+1) && this.board[2][1] == (this.player+1)) { // Middle Vert Column
			return this.player + 1;
		} else if (this.board[2][2] == (this.player+1) && this.board[1][2] == (this.player+1) && this.board[0][2] == (this.player+1)) { // Right Vert Column
			return this.player + 1;
		} else if (this.board[0][0] == (this.player+1) && this.board[1][1] == (this.player+1) && this.board[2][2] == (this.player+1)) { // Top Left to Bottom Right Row
			return this.player + 1;
		} else if (this.board[0][2] == (this.player+1) && this.board[1][1] == (this.player+1) && this.board[2][0] == (this.player+1)) { // Top Right to Bottom Left Row
			return this.player + 1;
		} else {
			return 0;
		}
		
	}
	
	public boolean checkSpace() {
		int[] calcEntry = new int[2];
		calcEntry[0] = (this.enter - 1) % 3; // Find the first array cell
		calcEntry[1] = (this.enter - 1) / 3; // Find the second array cell
		if (this.board[calcEntry[1]][calcEntry[0]] == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
