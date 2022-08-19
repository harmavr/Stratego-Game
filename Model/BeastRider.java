package Model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Board1.PieceColor;

public class BeastRider extends MovablePiece  {
	
	private int numOfResques;
	private Board1 board1;

	
	
	
	/**
	 * constructor:κατασκευαζει ενα Αναβατη
	 * Postcondition: δημιουργει και αρχικοποιει ενα νεο Αναβατη με τα δωθεν χαρακτηριστικα
	 * @param live αν ζει
	 * @param power η δυναμη
	 * @param x η οριζοντια
	 * @param y η καθετη θεση
	 * @param color το χρωμα
	 */
	public BeastRider(boolean live, int power, int x,int y,Model.Board1.PieceColor color) {
		super(true);
		this.power=7;
		this.numOfResques=0;

	}
	
	

	/**
	* transformer:οριζει το αν ο Αναβατης ζει
	* postcondition:εκχωρει στην παραμετρο live της κλασης το ορισμα της μεθοδου
	* @param live
	*/
	public void setHasSurived(boolean live){
		this.live=live;
	}
	
	
	
	/**
	 * accessor:επιστρεφει αν ο Αναβατης ειναι ζωντανος
	 * postcondition:πρεπει να επιστρεψει αν ο Αναβατης ειναι ζωντανος
	 * @return live
	 */
	public boolean hasSurvived() {
		return live;
	}
	
	
	
	
	/**
	 * αccessor:επιθεση του Αναβατη σε ενα αντιπαλο
	 * postcondition:αν εχει νικησει την επιθεση εκχωρει τον αντιπαλο στον πινακα pieceOffBoard αλλιως εκχωρει τον Αναβατη
	 * @param element το πιονι που κανει την επιθεση
	 * @param x1 η οριζοντια θεση του πιονιου που δεχεται την επιθεση 
	 * @param y1 η καθετη θεση του πιονιου που δεχεται την επιθεση
	 * @param x2 η οριζοντια θεση του πιονιου που κανει την επιθεση
	 * @param y2 η καθετη θεση του πιονιου που κανει την επιθεση
	 * @param element2 το πιονι που δεχεται την επιθεση
	 * @param board ο πινακας με τα πιονια
	 * @param i η τιμη του αποτελεσματος της επιθεσης
	 * @return i η τιμη του αποτελεσματος της επιθεσης
	 * (αν i=1 τοτε το πιονι νικησε,  αν i=2 το πιονι εχασε , αν i=3 ηρθε ισοπαλια)
	 */
	
	
	public int attack(Piece element,int x1,int y1,int x2,int y2,Piece element2,Piece [][] board,int i){
		
		
			if((((x1==x2+1 && y1==y2 )|| (y1==y2+1 && x1==x2) || (x1==x2-1 && y1==y2)|| y1==y2-1 && x1==x2))){
				
				if(board[x1][y1]!=null && board[x1][y1].getColor()!=board[x2][y2].getColor()){
			
					if(board[x1][y1] instanceof Flag ){
						JOptionPane.showMessageDialog (null, "Nikisate", "telos game", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
				
				if(this.power>((Piece) element2).getPower()){
					element.live=true;
					element2.live=false;
					board[x1][y2]=board[x2][y2];
				//	board[x2][y2]=null;
					i= 1;
			
		
				}
		
		
				else if(this.power<((Piece)element2).getPower()){
					element.live=false;
					element2.live=true;
				//	board[x2][y2]=null;
						i= 2;
						

			}
		
				else{
					element.live=false;
					element2.live=false;
				//	board[x1][y1]=null;
				//	board[x2][y2]=null;
					i= 3;
		

		}
	}
		}

		return i;
		

	}

	
	
	
	/**
	 * observer:μετακινηση του Αναβατη 
	 * postcondition:ελεγχος αν μπορει να παει ο Αναβατης στη συγκεκριμενη θεση και τις πιθανες θεσεις που μπορει να μετακινηθει
	 * @param element το πιονι που μετακινειται
	 * @param x1 η οριζοντια θεση που θα παει το πιονι 
	 * @param y1 η καθετη θεση που θα παει το πιονι
	 * @param x2 η οριζοντια θεση του πιονιου που μετακινειται
	 * @param y2 η καθετη θεση του πιονιου που μετακινειται
	 * @param success η τιμη του αποτελεσματος της μετακινησης
	 * @param board ο πινακας με τα πιονια
	 * @return success η τιμη του αποτελεσματος της μετακινησης
	 * (αν success=true τοτε μπορει να παει στην θεση αυτη αλλιως οχι)
	 */
public boolean moveTo(Piece element,int x1,int y1,int x2,int y2,boolean success,Piece[][] board){
	if((x1==x2+1 && y1==y2 )|| (y1==y2+1 && x1==x2) || (x1==x2-1 && y1==y2)|| y1==y2-1 && x1==x2)
		if(board[x1][y1]==null){
		
		success=true;
		}
	
return success;
}
		

	
	


	/**
	 * accessor:επιστρεφει αν ο Αναβατης βρισκεται στην περιοχη οπου μπορει να διασωσει ενα πιονι
	 * postcondition:πρεπει να επισρεψει αν ο Αναβατης βρισκεται στην περιοχη οπου μπορει να διασωσει ενα πιονι
	 * @return position
	 */
	public boolean ResquePosition(String position) {
		return false;
	}

	
	/**
	 * transformer:οριζει το ποσες διασωσεις εχει κανει ενας Αναβατης
	 * Postcondition:εχκωρει στην παραμετρο numOfResques της κλασης το ορισμα της μεθοδου
	 * @param numOfResques
	 */
	public void SetNumberOfResques(int numOfResques) {
	this.numOfResques=numOfResques;
	}

	
	
	/**
	 * accessor:επιστρεφει ποσες διασωσεις εχει κανει ενας Αναβατης
	 * postcondition:πρεπει να επιστρεψει το ποσες διασωσεις εχει κανει ενας Αναβατης
	 * @return numOfResques
	 */
	public int getNumberOfResques() {
		return numOfResques;
	}



	
	



	
}
