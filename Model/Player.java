package Model;

import java.awt.Color;
import java.util.ArrayList;

import Controller.controller;
import Model.Piece;


public  class Player {
	String name;
	private boolean lostFlag;
	private int numberOfResques;
	private boolean hasPlayed;
	private boolean SpecialHasPlayed;
	private Piece board[][];
	private MovablePiece mp = new MovablePiece(true);
	private boolean success=false,success1;
	int surv1;
	private int i1;
	public ArrayList <Piece> pieceOffBoard=new ArrayList<Piece>();
	

	
	
	/**
	 * constructor:κατασκευαζει ενα νεο Player
	 * postcondition:δημιουργει και αρχικοποει ενα νεο Player με το δωθεν χαρακτηριστικο
	 * @param name το ονομα του καθε παιχτη
	 */
	public Player(String name,boolean lostFlag){
		this.lostFlag=lostFlag;
		this.hasPlayed=false;
		this.SpecialHasPlayed=false;
		this.name=name;
		
		
	}
	
	
	/**
	 * transformer:οριζει αν εχει γινει ειδικη κινηση
	 * postcondition:εκχωρει στην παραμετρο SpecialHasPlayed της κλασης το ορισμα της μεθοδου
	 * @param SpecialHasPlayed
	 */
	public void setSpecialHasPlayed(boolean SpecialHasPlayed){
		this.SpecialHasPlayed=SpecialHasPlayed;
	}
	
	
	/**
	 * observer:επιστρεφει αν εχει γινει ειδικη κινηση
	 * postcondition:πρεπει να επιστρεψει αν εχει γινει ειδικη κινηση
	 * @return SpecialHasPlayed
	 */
	public boolean getSpecialHasPlayed(){
		return SpecialHasPlayed;
	}
	
	
	/**
	 * transformer:oριζει αν εχει γινει κινηση απο τον παιχτη
	 * postcondition:εκχωρει στην παραμετρο hasPlayed της κλασης το ορισμα της μεθοδου
	 * @param hasPlayed
	 */
	public void setHasPlayed(boolean hasPlayed){
		this.hasPlayed=hasPlayed;
		
	}
	
	
	/**
	 * observer:επιστρεφει αν εχει κανει κινηση ο παιχτης
	 * postcondition:πρεπει  να επιστρεψει αν εχει κανει κινηση ο παιχτης
	 * @return hasPlayed
	 */
	public boolean getHasPlayed(){
		return hasPlayed;
	}
	
	
	
	/**
	 * tranformer:οριζει αν εχει χαθει η σημαια
	 * postcondition:εκχωρει στην παραμετρο lostFlag της κλασης το ορισμα της μεθοδου
	 * @param lostFlag
	 */
	public void setLostFlag(Flag flag){
		if(flag.live==true)
		this.lostFlag=true;
	}
	
	
	
	/**
	 * observer:επιστρεφει αν εχει χαθει η σημαια
	 * postcondition:πρεπει  να επιστρεψει αν εχει χαθει η σημαια
	 * @return lostFlag
	 */
	public boolean getLostFlag(){
		return lostFlag;
	}
	
	
	/**
	 * observer:επιστρεφει την τιμη του αποτελεσματος της μετακινησης
	 * postocondition:πρεπει να επιστρεψει την τιμη του αποτελεσματος της μετακινησης
	 * @param element
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param board
	 * @return
	 */
	
	public boolean PlayerMove( Piece element,int x1, int y1,int x2,int y2,Piece[][]board){
	
	boolean success1=mp.moveTo(element, x1, y1,x2,y2, success,board);
		
		return success1;
	}
	
	/**
	 * accessor:επιστρεφει την τιμη του αποτελεσματος της μαχης
	 * postcondition:πρεπει να επιστρεψει την τιμη του αποτελεσματος της μαχης
	 * @param element
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param element2
	 * @param board
	 * @return
	 */
	
	public int PlayerAttack(Piece element,int x1, int y1,int x2,int y2,Piece element2,Piece[][]board){
		int i=mp.attack(element, x1, y1, x2, y2, element2, board,i1);
		return i;
	}
	
	
	
	/**
	 * tranformer:οριζει το ποσες διασωσεις εχει κανει ενας παιχτης
	 * postcondition:εκχωρει στην παραμετρο numberOfResques της κλασης το ορισμα της μεθοδου
	 * @param numberOfResques
	 */
	public void setNumberOfResques(int numberOfResques){
		this.numberOfResques=numberOfResques;
	}
	
	
	/**
	 * accessor:επιστρεφει το ποσες φορες εχει διασωσει ενας παιχτης ενα πιονι
	 * Postcondition:πρεπει να επιστρεψει το ποσες φορες εχει διασωσει ενας παιχτης ενα πιονι 
	 * @return numberOfResques
	 */
	public int getNumberOfResques(){
		return numberOfResques;
	}
	

}
