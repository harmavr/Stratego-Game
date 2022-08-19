package Model;

public class Bomb extends ImmovablePiece{

	
	
	

	/**
	 * constructor:κατασκευαζει ενα νεο Bomb
	 * postcondition:δημιουργει και αρχικοποιει ενα νεο Bomb με τα δωθεν χαρακτηριστικα
	 * @param exist αν ζει
	 * @param power η δυναμη
	 * @param x η οριζοντια
	 * @param y η καθετη θεση
	 * @param color το χρωμα
	*/
	public Bomb(boolean exist, int power, int x,int y,Model.Board1.PieceColor color) {
		super(true);
		this.power=100;
	}


	public boolean getHasSurvived(){
		return live;
	}
	
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	
}
