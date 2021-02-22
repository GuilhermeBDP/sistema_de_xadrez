package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // N�o seria necess�rio pois o java coloca o valor null por padr�o
	}

	protected Board getBoard() {
		return board;
	}
	
	
		
}
