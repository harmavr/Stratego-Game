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
	 * constructor:������������ ��� ��� Player
	 * postcondition:���������� ��� ���������� ��� ��� Player �� �� ����� ��������������
	 * @param name �� ����� ��� ���� ������
	 */
	public Player(String name,boolean lostFlag){
		this.lostFlag=lostFlag;
		this.hasPlayed=false;
		this.SpecialHasPlayed=false;
		this.name=name;
		
		
	}
	
	
	/**
	 * transformer:������ �� ���� ����� ������ ������
	 * postcondition:������� ���� ��������� SpecialHasPlayed ��� ������ �� ������ ��� �������
	 * @param SpecialHasPlayed
	 */
	public void setSpecialHasPlayed(boolean SpecialHasPlayed){
		this.SpecialHasPlayed=SpecialHasPlayed;
	}
	
	
	/**
	 * observer:���������� �� ���� ����� ������ ������
	 * postcondition:������ �� ���������� �� ���� ����� ������ ������
	 * @return SpecialHasPlayed
	 */
	public boolean getSpecialHasPlayed(){
		return SpecialHasPlayed;
	}
	
	
	/**
	 * transformer:o����� �� ���� ����� ������ ��� ��� ������
	 * postcondition:������� ���� ��������� hasPlayed ��� ������ �� ������ ��� �������
	 * @param hasPlayed
	 */
	public void setHasPlayed(boolean hasPlayed){
		this.hasPlayed=hasPlayed;
		
	}
	
	
	/**
	 * observer:���������� �� ���� ����� ������ � �������
	 * postcondition:������  �� ���������� �� ���� ����� ������ � �������
	 * @return hasPlayed
	 */
	public boolean getHasPlayed(){
		return hasPlayed;
	}
	
	
	
	/**
	 * tranformer:������ �� ���� ����� � ������
	 * postcondition:������� ���� ��������� lostFlag ��� ������ �� ������ ��� �������
	 * @param lostFlag
	 */
	public void setLostFlag(Flag flag){
		if(flag.live==true)
		this.lostFlag=true;
	}
	
	
	
	/**
	 * observer:���������� �� ���� ����� � ������
	 * postcondition:������  �� ���������� �� ���� ����� � ������
	 * @return lostFlag
	 */
	public boolean getLostFlag(){
		return lostFlag;
	}
	
	
	/**
	 * observer:���������� ��� ���� ��� ������������� ��� �����������
	 * postocondition:������ �� ���������� ��� ���� ��� ������������� ��� �����������
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
	 * accessor:���������� ��� ���� ��� ������������� ��� �����
	 * postcondition:������ �� ���������� ��� ���� ��� ������������� ��� �����
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
	 * tranformer:������ �� ����� ��������� ���� ����� ���� �������
	 * postcondition:������� ���� ��������� numberOfResques ��� ������ �� ������ ��� �������
	 * @param numberOfResques
	 */
	public void setNumberOfResques(int numberOfResques){
		this.numberOfResques=numberOfResques;
	}
	
	
	/**
	 * accessor:���������� �� ����� ����� ���� �������� ���� ������� ��� �����
	 * Postcondition:������ �� ���������� �� ����� ����� ���� �������� ���� ������� ��� ����� 
	 * @return numberOfResques
	 */
	public int getNumberOfResques(){
		return numberOfResques;
	}
	

}
