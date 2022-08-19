package Model;

import java.util.ArrayList;


public  class MovablePiece extends Piece {

int x,y;
	protected Piece[][] board;
	


		

	/**
	 * constructor: κατασκευαζει ενα νεο Movable πιονι με τα παρακατω χαρακτηριστικα
	 * postcondition:δημιουργει και αρχικοποιει ενα νεο Movabel πιονι με τα παρακατω χαρακτηριστικα
	 * @param live πληροφορει αν το πιονι ζει η οχι
	 */
	MovablePiece(boolean live) {
		super(live);
		
	
	}

	
	/**
	 * observer:επιστρφει αν επεζησε απο στη μαχη το πιονι που επιτεθηκε
	 * postcondition:πρεπει να επιστρεψει true αν επεζησε απο τη μαχη αλλιως false
	 * @return true αν επεζησε στη μαχη αυτος που επιτεθηκε
	 */
	public boolean hasSurvived(){
		return live;
	}
	
	
	
	
	/**
	 * transformer:οριζει αν ζει το κινουμενο πιονι
	 * postcondition:εκχωρει στην παραμετρο live της κλασης το ορισμα της μεθοδου
	 * @param live
	 * 
	 */
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	
	
	
	/**
	 * observer:επιστρεφει αν η θεση του πιονιου ειναι ιση με αυτη του ταμπλου που μπορει να γινει η διασωση ενος αλλου πιονιου
	 * @param potision
	 * @return επιστρεφει true αν η θεση ειναι ιση με αυτη στην οποια μπορει να γινει η διασωση αλλιως false
	 */
	public  boolean ResquePosition(int x,int y){
		return live;
		
	}
	
	
	
	
	/**
	 * transformer:οριζει το ποσες φορες εχει διασωσει ενα πιονι
	 * postcondition:εκχωρει στην παραμετρο numOfResques της κλασης το ορισμα της μεθοδου
	 * @param numOfResques
	 */
	public  void SetNumberOfResques(int numOfResques){
		
	}
	
	
	
	/**
	 * accessor:επιστρεφει το ποσες φορες εχει διασωσει ενα πιονι
	 * postcondition:επιστρεφει την παραμετρο numOfResques
	 * @return numOfResques
	 */
	
	public  int getNumberOfResques(){
		return 0;
		
	}
	
	
	/**
	 * οbserver:επιθεση ενος πιονιου σε ενα αντιπαλο
	 * postcondition:το movablepiece επιτεθηκε
	 * @param element το πιονι που κανει την επιθεση
	 * @param x1 η οριζοντια θεση του πιονιου που δεχεται την επιθεση 
	 * @param y1 η καθετη θεση του πιονιου που δεχεται την επιθεση
	 * @param x2 η οριζοντια θεση του πιονιου που κανει την επιθεση
	 * @param y2 η καθετη θεση του πιονιου που κανει την επιθεση
	 * @param element2 το πιονι που δεχεται την επιθεση
	 * @param board ο πινακας με τα πιονια
	 * @param i η τιμη του αποτελεσματος της επιθεσης
	 * @return i η τιμη του αποτελεσματος της επιθεσης
	 */
	
	public  int  attack(Piece element,int x1,int y1,int x2,int y2,Piece element2,Piece [][] board,int i1){
	
		int i=((MovablePiece)board[x2][y2]).attack(element, x1, y1, x2, y2, element2, board,i1);
		return i;
	}

	
	
	/**
	 * observer:μετακινηση ενος πιονιου 
	 * postcondition:ελεγχος αν μπορει να παει το πιονι στη συγκεκριμενη θεση και τις πιθανες θεσεις που μπορει να μετακινηθει
	   * @param element το πιονι που μετακινειται
	 * @param x1 η οριζοντια θεση που θα παει το πιονι 
	 * @param y1 η καθετη θεση που θα παει το πιονι
	 * @param x2 η οριζοντια θεση του πιονιου που μετακινειται
	 * @param y2 η καθετη θεση του πιονιου που μετακινειται
	 * @param success η τιμη του αποτελεσματος της μετακινησης
	 * @param board ο πινακας με τα πιονια
	 * @return success η τιμη του αποτελεσματος της μετακινησης
	 */
	public  boolean moveTo(Piece element, int x1, int y1,int x2,int y2,boolean success1,Piece[][]board) throws StackOverflowError{
		
			
				
	boolean	success=((MovablePiece) board[x2][y2]).moveTo(element, x1, y1,x2,y2, success1, board);
		return success;
	}
	
}
	

