package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // Não seria necessário pois o java coloca o valor null por padrão
	}

	protected Board getBoard() {
		return board;
	}
	
	
		
}
