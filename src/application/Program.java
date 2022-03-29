package application;

import java.util.Scanner;
import boardgame.Position;
import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Board board = new Board(8, 8);
		Position pos = new Position(3, 5);
		System.out.println(pos);
		System.out.println(board);
		
		sc.close();
	}
}