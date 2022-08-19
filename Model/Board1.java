package Model;
import Model.BeastRider;

public class Board1 {
	public enum PieceColor{BLUE,RED}
	private  PieceColor color;
	private  Piece[][] board= new Piece[8][10];
	private Board1 board1;
	/**
	 * constructor:κατασκευαζει ενα Board
	 * postcondition:δημιουργει και αρχικοποιει ενα νεο Board με τα δωθεν χαρακτηριστικα
	 */
	public Board1(){
		
		color=PieceColor.BLUE;
	
		
		 	board[2][0]=new Bomb(true, 100, 0, 0, color);
		 	board[0][1]=new Dwarf(true, 3, 0, 1, color);
		 	board[0][2]=new Scout(true, 2, 0, 2, color);
		 	board[0][3]=new Dwarf(true, 3, 0, 3, color);
		 	board[0][4]=new Yeti(true, 5, 0, 4, color);
		 	board[0][5]=new Flag(true, 0, 0, 5, color);
		 	board[0][6]=new Sorceress(true, 6, 0, 6, color);
		 	board[0][7]=new Bomb(true, 100, 0, 7, color);
		 	board[0][8]=new Yeti(true, 5, 0, 8, color);
		 	board[0][9]=new Dwarf(true, 3, 0, 9, color);
		 	board[1][0]=new Bomb(true, 100, 1, 0, color);
		 	board[1][8]=new Dragon(true, 10, 1, 1, color);
		 	board[2][1]=new Scout(true, 2, 1, 2, color);
		 	board[1][3]=new Mage(true, 9, 1, 3, color);
		 	board[1][4]=new Bomb(true, 100, 1, 4, color);
		 	board[1][5]=new Elf(true, 4, 1, 5, color);
		 	board[1][6]=new Knight(true, 8, 1, 6, color);
		 	board[1][7]=new BeastRider(true, 7, 1, 7, color);
		 	board[1][1]=new Scout(true, 2, 1, 8, color);
		 	board[1][9]=new BeastRider(true, 7, 1, 9, color);
		 	board[0][0]=new BeastRider(true, 7, 2, 0, color);
		 	board[1][2]=new Bomb(true, 100, 2, 1, color);
		 	board[2][2]=new Dwarf(true, 3, 2, 2, color);
		 	board[2][3]=new Scout(true, 2, 2, 3, color);
		 	board[2][4]=new Elf(true, 4, 2, 4, color);
		 	board[2][5]=new Sorceress(true, 6, 2, 5, color);
		 	board[2][6]=new Knight(true, 8, 2, 6, color);
		 	board[2][7]=new Bomb(true, 100, 2, 7, color);
		 	board[2][8]=new Dwarf(true, 3, 2, 8, color);
		 	board[2][9]=new Slayer(true, 1, 2, 9, color);
		
		 	for(int i=0;i<3;i++)
		 		for(int j=0;j<10;j++){
		 			board[i][j].setColor(PieceColor.BLUE);
		 			
 			
				}
		 	
			color=PieceColor.RED;

		 	
		 	board[5][0]=new Bomb(true, 100, 0, 0, color);
		 	board[5][2]=new Dwarf(true, 3, 0, 1, color);
		 	board[5][1]=new Scout(true, 2, 0, 2, color);
		 	board[5][3]=new Dwarf(true, 3, 0, 3, color);
		 	board[5][4]=new LavaBeast(true, 5, 0, 4, color);
		 	board[5][5]=new Flag(true, 0, 0, 5, color);
		 	board[5][6]=new Sorceress(true, 6, 0, 6, color);
		 	board[5][7]=new Bomb(true, 100, 0, 7, color);
		 	board[5][8]=new LavaBeast(true, 5, 0, 8, color);
		 	board[5][9]=new Dwarf(true, 3, 0, 9, color);
		 	board[6][0]=new Bomb(true, 100, 1, 0, color);
		 	board[6][1]=new Dragon(true, 10, 1, 1, color);
		 	board[6][2]=new Scout(true, 2, 1, 2, color);
		 	board[6][3]=new Mage(true, 9, 1, 3, color);
		 	board[6][4]=new Bomb(true, 100, 1, 4, color);
		 	board[6][5]=new Elf(true, 4, 1, 5, color);
		 	board[6][6]=new Knight(true, 8, 1, 6, color);
		 	board[6][7]=new BeastRider(true, 7, 1, 7, color);
		 	board[6][8]=new Scout(true, 2, 1, 8, color);
		 	board[6][9]=new BeastRider(true, 7, 1, 9, color);
		 	board[7][0]=new BeastRider(true, 7, 2, 0, color);
		 	board[7][1]=new Bomb(true, 100, 2, 1, color);
		 	board[7][2]=new Dwarf(true, 3, 2, 2, color);
		 	board[7][3]=new Scout(true, 2, 2, 3, color);
		 	board[7][4]=new Elf(true, 4, 2, 4, color);
		 	board[7][5]=new Sorceress(true, 6, 2, 5, color);
		 	board[7][6]=new Knight(true, 8, 2, 6, color);
		 	board[7][7]=new Bomb(true, 100, 2, 7, color);
		 	board[7][8]=new Dwarf(true, 3, 2, 8, color);
		 	board[7][9]=new Slayer(true, 1, 2, 9, color);
		 	
		 	
		 	
		 	for(int i=5;i<8;i++)
		 	for(int j=0;j<10;j++){
		 			board[i][j].setColor(PieceColor.RED);
		 			 						 		
}
		 	
		 	
		 			
	}				
	
	
	/**
	 * accessor:επιστρεφει τον πινακα
	 * postcondition πρεπει να επιστρεψει τον πινακα με τα πιονια
	 * @return board
	 */
	public   Piece[][] getBoard(){
		
		return board;
		
	}
	
	/**
	 * accessor:επιστρεφει το στοιχειο με i και j συντεταγμενες
	 * postcondition:πρεπει να επιστρεψει το στοιχειο του πινακα με i και j συντεταγμενες
	 * @param i η οριζοντια θεση
	 * @param j η καθετη θεση
	 * @return board[i][j]
	 */
	
	public Piece getElement(int i, int j){
		return board[i][j];
	}
	
	
	
	/**
	 * trasnformer:θετει το στοιχειο στις i και j θεσεις
	 * postcondition: πρεπει να θεσει το στοιχειο στις i και j θεσεις
	 * @param p
	 * @param x1
	 * @param y1
	 */
	public void setElement(Piece p,int x1, int y1){
		board[x1][y1]=p;
	}
	
	
		
	

}
