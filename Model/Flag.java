package Model;

public class Flag extends ImmovablePiece {
	
	
	/**
	 * constructor:κατασκευαζει ενα νεο Flag
	 * postcondition:δημιουργει και αρχικοποιει ενα νεο Flag με τα δωθεν χαρακτηριστικα
	  * @param live αν ζει
	 * @param power η δυναμη
	 * @param x η οριζοντια
	 * @param y η καθετη θεση
	 * @param color το χρωμα
	*/
	public Flag(boolean exist, int power, int x,int y,Model.Board1.PieceColor color) {
		super(exist);
	}

	
	public boolean getHasSurvived(){
		return live;
	}
	
	
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	
	
}