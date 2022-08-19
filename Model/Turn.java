package Model;

public class Turn {
	
	private int turn;
	private int lastplayer;
	private Player player;
	

	/**
	 * constructor:κατασκευαζει ενα νεο Turn
	 * postcondition:δημιουργει και αρχικοποιει ενα νεο Turn με τα δωθεν χαρακτηριστικα
	 * @param turn ο γυρος του παιχτη(turn 1 εχει ο μπλε και turn 2 εχει ο κοκκινος)
	 */
	public Turn(int turn){
		this.turn=turn;
		this.lastplayer=0;
	}
	
	
	/**
	 * transformer:οριζει ενα νεο γυρο
	 * postcondition:εκχωρει στην παραμετρο turn της κλασης το ορισμα της μεθοδου
	 * @param turn
	 */
	public void setTurn(int turn){
		if(turn==1 && !player.getHasPlayed()){
		this.turn=1;
		this.lastplayer=0;
		}
		
		else if(turn==1 && player.getHasPlayed()){
			this.turn=2;
			this.lastplayer=1;
			player.setHasPlayed(true);
		}
		
		else if(turn==2 && !player.getHasPlayed()){
			this.turn=2;
			this.lastplayer=1;
		}
		
		else if(turn==2 && player.getHasPlayed()){
			this.turn=1;
			this.lastplayer=2;
			player.setHasPlayed(true);
		}
	}
	
	
	/**
	 * accessor:επιστρεφει το γυρο του παιχτη
	 * postcondition:πρεπει να επιστρεψει το γυρο του παιχτη
	 * @return
	 */
	public int getTurn(){
		return turn;
	}

}
