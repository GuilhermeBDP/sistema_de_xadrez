package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		
		Position pos = new Position(3, 5);
		System.out.println(pos);
		
		Board board = new Board(8, 8);

	}

}
