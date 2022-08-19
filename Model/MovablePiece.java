package Model;

import java.util.ArrayList;


public  class MovablePiece extends Piece {

int x,y;
	protected Piece[][] board;
	


		

	/**
	 * constructor: ������������ ��� ��� Movable ����� �� �� �������� ��������������
	 * postcondition:���������� ��� ����������� ��� ��� Movabel ����� �� �� �������� ��������������
	 * @param live ���������� �� �� ����� ��� � ���
	 */
	MovablePiece(boolean live) {
		super(live);
		
	
	}

	
	/**
	 * observer:��������� �� ������� ��� ��� ���� �� ����� ��� ���������
	 * postcondition:������ �� ���������� true �� ������� ��� �� ���� ������ false
	 * @return true �� ������� ��� ���� ����� ��� ���������
	 */
	public boolean hasSurvived(){
		return live;
	}
	
	
	
	
	/**
	 * transformer:������ �� ��� �� ��������� �����
	 * postcondition:������� ���� ��������� live ��� ������ �� ������ ��� �������
	 * @param live
	 * 
	 */
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	
	
	
	/**
	 * observer:���������� �� � ���� ��� ������� ����� ��� �� ���� ��� ������� ��� ������ �� ����� � ������� ���� ����� �������
	 * @param potision
	 * @return ���������� true �� � ���� ����� ��� �� ���� ���� ����� ������ �� ����� � ������� ������ false
	 */
	public  boolean ResquePosition(int x,int y){
		return live;
		
	}
	
	
	
	
	/**
	 * transformer:������ �� ����� ����� ���� �������� ��� �����
	 * postcondition:������� ���� ��������� numOfResques ��� ������ �� ������ ��� �������
	 * @param numOfResques
	 */
	public  void SetNumberOfResques(int numOfResques){
		
	}
	
	
	
	/**
	 * accessor:���������� �� ����� ����� ���� �������� ��� �����
	 * postcondition:���������� ��� ��������� numOfResques
	 * @return numOfResques
	 */
	
	public  int getNumberOfResques(){
		return 0;
		
	}
	
	
	/**
	 * �bserver:������� ���� ������� �� ��� ��������
	 * postcondition:�� movablepiece ���������
	 * @param element �� ����� ��� ����� ��� �������
	 * @param x1 � ��������� ���� ��� ������� ��� ������� ��� ������� 
	 * @param y1 � ������ ���� ��� ������� ��� ������� ��� �������
	 * @param x2 � ��������� ���� ��� ������� ��� ����� ��� �������
	 * @param y2 � ������ ���� ��� ������� ��� ����� ��� �������
	 * @param element2 �� ����� ��� ������� ��� �������
	 * @param board � ������� �� �� ������
	 * @param i � ���� ��� ������������� ��� ��������
	 * @return i � ���� ��� ������������� ��� ��������
	 */
	
	public  int  attack(Piece element,int x1,int y1,int x2,int y2,Piece element2,Piece [][] board,int i1){
	
		int i=((MovablePiece)board[x2][y2]).attack(element, x1, y1, x2, y2, element2, board,i1);
		return i;
	}

	
	
	/**
	 * observer:���������� ���� ������� 
	 * postcondition:������� �� ������ �� ���� �� ����� ��� ������������ ���� ��� ��� ������� ������ ��� ������ �� �����������
	   * @param element �� ����� ��� ������������
	 * @param x1 � ��������� ���� ��� �� ���� �� ����� 
	 * @param y1 � ������ ���� ��� �� ���� �� �����
	 * @param x2 � ��������� ���� ��� ������� ��� ������������
	 * @param y2 � ������ ���� ��� ������� ��� ������������
	 * @param success � ���� ��� ������������� ��� �����������
	 * @param board � ������� �� �� ������
	 * @return success � ���� ��� ������������� ��� �����������
	 */
	public  boolean moveTo(Piece element, int x1, int y1,int x2,int y2,boolean success1,Piece[][]board) throws StackOverflowError{
		
			
				
	boolean	success=((MovablePiece) board[x2][y2]).moveTo(element, x1, y1,x2,y2, success1, board);
		return success;
	}
	
}
	

