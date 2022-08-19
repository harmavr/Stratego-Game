package Controller;



import Model.Board1;
import Model.Piece;
import Model.Player;



public  class controller {
	
	
	private Player player2 = new Player("EverWinter",false);
	private Board1 board1;
	private Player player1=new Player("Volcandira",false);

	
	
	/**
	 * constructor:κατασκευαζει ενα νεο Controller και τον παιχτη player1
	 * Postcondition:δημιουργει και αρχικοποιει ενα νεο Controller και τον παιχτη player1
	 * δινει ονομα στους παιχτες, αρχικοποει το board
	 */
	public controller(){
		
		Player player1= new Player("Volcandria",false);
	

		
	}
	
	
	
	/**
	 * transformer:ενας παιχτης κανει επιθεση
	 * Postcondition:ο παιχτης εκανε επιθεση
	 * @param element το πιονι που κανει επιθεση
	 * @param x1 η οριζοντια θεση του πιονιου που δεχεται επιθεση
	 * @param y1 η καθετη θεση του πιονιου που δεχεται επιθεση
	 * @param x2 η οριζοντια θεση του πιονιου που κανει την επιθεση
	 * @param y2 η καθετη θεση του πιονιου που κανει την επιθεση
	 * @param element2 το πιονι που δεχεται την επιθεση
	 * @param board ο πινακας με τα πιονια
	 * @return i η τιμη του αποτελεσματος της επιθεσης
	 */
	public int Make_An_Attack(Piece element,int x1, int y1,int x2,int y2,Piece element2,Piece[][]board){
	int i=player1.PlayerAttack(element, x1, y1, x2, y2, element2, board);
	//System.out.println(i);
	return i;
	}
	
	
	/**
	 * transformer:εναs παιχτης μετακινει το πιονι
	 * postcondition:ενας παιχτης μετακινησε ο πιονι του
	 @param element το πιονι που μετακινειται
	 * @param x1 η οριζοντια θεση του πιονιου που θα παει το πιονι
	 * @param y1 η καθετη θεση του πιονιου που θα παει το πιονι
	 * @param x2 η οριζοντια θεση του πιονιου που μετακινειται
	 * @param y2 η καθετη θεση του πιονιου που μετακινειται
	 * @param element2 η θεση που θα παει το πιονι
	 * @param board ο πινακας με τα πιονια
	 * @return successMove η τιμη του αποτελεσματος της μετακινησης
	*/
	public boolean Make_A_Move(Piece element,int x1, int y1,int x2,int y2,Piece[][]board){
		 boolean successMove=player1.PlayerMove(element, x1, y1,x2,y2,board);
		 
	
		return successMove;
			
	}
	
	
	
	
	
	/**
	 * tranformer:διασωση ενος πιονιου
	 * postcondition:η μεθοδος παιρνει ως ορισμα τον πινακα που εχει τα πιονια που εχουν χαθει στη μαχη και τα βαζει παλι στο παιχνιδι
	 * @param pieceOffBoard
	 */
	//public void Resque_A_Piece(Piece pieceOffBoard){
	//	pieceOnBoard.add(pieceOffBoard);
	//}
	
	/**
	 * οbserver:επιστρεφει αν ο παιχτης εχει τελειωσει το γυρω του
	 * postcondition:πρεπει να επιστρεψει αν ο παιχτης εχει τελειωσει τον γυρω του
	 * @return
	 */
//	public boolean PlayerHasPlayed(){
	//	return playerhasplayed;
	//}
	

}
