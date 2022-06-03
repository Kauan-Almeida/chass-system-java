package application;

import java.util.Scanner;
import boardgame.Position;
import chess.ChessMatch;
import boardgame.Board;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		sc.close();
	}
}