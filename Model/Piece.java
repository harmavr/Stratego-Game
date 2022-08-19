package Model;


public  class Piece {
	
	protected boolean live;
	protected int power;
	private int x,y;
	protected Model.Board1.PieceColor color;


/**
 * constructor:κατασκευαζει ενα νεο πιονι με τα δοθεν χαρακτηριστικα
 * postcondition:δημιουργει και αρχικοποιει ενα νεο πιονι με τα δοθεν χαρακτηριστικα
 * @param live πληροφορει αν το πιονι ζει η οχι 
 */
	Piece(boolean live){
	this.live=live;
		

	}
	
	
	/**
	 * accessor:επιστρεφει αν ζει το πιονι
	 * postcondition:πρεπει να επιστρεψει αν ζει το πιονι
	 * @return name
	 */
	public boolean getHasSurvived(){
		return live;
	}
	
	
	
	/**
	 * transformer:οριζει αν ζει το πιονι
	 * postcondition:εκχωρει στην παραμετρο live της κλασης το ορισμα της μεθοδου
	 * @param live
	 */
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	
	
	/**
	 * accessor:επιστρεφει τη δυναμη του πιουνιου
	 * postcondition:πρεπει να επιστρεψει τη δυναμη του πιονιου
	 * @return power
	 */
	public int getPower(){
		return power;
	}
	

	
	/**
	 * transofrmer:οριζει τη δυναμη του πιονιου
	 * postcondition:εκχωρει στην παραμετρο power της κλασης το ορισμα της μεθοδου
	 * @param power
	 */
	public void setPower(int power){
		this.power=power;
	}
	

	
	/**
	 * transformer:οριζει τη θεση του πιονιου
	 * postcondition:εκχωρει στην παραμετρο position της κλασης το ορισμα της μεθοδου
	 * @param potision
	 */
	public void setXposition(int x){
		this.x=x;
	}
	
	
	
	/**
	 * transformer:οριζει τη θεση του πιονιου
	 * postcondition:εκχωρει στην παραμετρο position της κλασης το ορισμα της μεθοδου
	 * @param potision
	 */
	public void setYposition(int y){
		this.y=y;
	}

	
	
	/**
	 * accessor:επιστρεφει τη θεση x του πιονιου
	 * postcondition:πρεπει να επιστρεψει τη θεση χ του πιονιου
	 * @return x
	 */
	public int getXposition(){
		return x;
	}
	
	
	
	
	/**
	 * accessor:επιστρεφει τη θεση y του πιονιου
	 * postcondition:πρεπει να επιστρεψει τη θεση y του πιονιου
	 * @return y
	 */
	public int getYposition(){
		return y;
	}
	
	
	
	/**
	 * transformer:οριζει το χρωμα για ενα πιονι
	 * Postcondition:εκχωρει στην παραμετρο color της κλασης το ορισμα της κλασης
	 * @param color
	 */
	
	public void setColor(Model.Board1.PieceColor color){
		this.color=color;
	}
	
	
	/**
	 * accessor:επιστρεφει το χρωμα του πιονιου
	 * Postcondition:πρεπει να επιστρεψει το χρωμα του πιονιου
	 * @return color
	 */
	public  Model.Board1.PieceColor getColor(){
		return color;
	}


	

	
}
