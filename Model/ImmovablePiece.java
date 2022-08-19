package Model;

public class ImmovablePiece extends Piece {

	
	
	/**
	 * constructor:κατασκευαζει ενα νεο Ιmmovable Piece
	 * postcondition:αρχικοποει και δημιουργει ενα νεο Immovable Piece με τα δωθεν χαρακτηριστικα
	 * @param exist μας πληροφορει αν υπαρχει το πιονι
	 * @param power η δυναμη του πιονιου
	 * @param position η θεση του πιονιου
	 * @param color το χρωμα του πιονιου
	 */
	public ImmovablePiece(boolean exist) {
		super(exist);
	}

	
	public boolean hasSurvived(){
		return live;
	}
	
	
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	

}
