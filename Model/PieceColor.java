package Model;

public class PieceColor {
	private enum Color{RED,BLUE}
	private Color color;
	
	
	
	
	/**
	 * transformer:οριζει το χρωμα πιονιου
	 * postcondition:εκχωρει στην παραμετρο color της κλασης το ορισμα της μεθοδου
	 * @param color το χρωμα του πιονιου
	 */
	public void setColor(Color color){
				this.color=color;
	}

	
	
	/**
	 * accessor:επιστρεφει το χρωμα του πιονιου
	 * postcondition:πρεπει να επιστρεψει το χρωμα του πιονιου
	 * @return color
	 */
	public Color getColor(){
		return color;
	}
}
