package Model;

import java.awt.Component;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import view.Graphic;

public class Dragon extends MovablePiece{
	
	private int numOfResques;
	
	
	
	/**
	 * constructor:������������ ��� �����
	 * Postcondition: ���������� ��� ����������� ��� ��� ����� �� �� ����� ��������������
	 * @param live �� ���
	 * @param power � ������
	 * @param x � ���������
	 * @param y � ������ ����
	 * @param color �� �����
	*/
	
	public Dragon(boolean live, int power, int x,int y,Model.Board1.PieceColor color) {
		super(true);
		this.power=10;
		
	}
	
	

	/**
	 * transformer:������ �� �� � ������ ���
	 * postcondition:������� ���� ��������� live ��� ������ �� ������ ��� �������
	 * @param live
	 */
	public void setHasSurived(boolean live){
		this.live=live;
	}
	
	
	
	/**
	 * accessor:���������� �� � ������ ����� ��������
	 * postcondition:������ �� ���������� �� � ������ ����� ��������
	 * @return live
	 */
	public boolean hasSurvived() {
		return live;
	}
	
	/**
	 * �bserver:������� ���� ������� �� ��� ��������
	 * postcondition:�� ���� ������� ��� ������� ������� ��� �������� ���� ������ pieceOffBoard ������ ������� ��� �����������
	 * @param element �� ����� ��� ����� ��� �������
	 * @param x1 � ��������� ���� ��� ������� ��� ������� ��� ������� 
	 * @param y1 � ������ ���� ��� ������� ��� ������� ��� �������
	 * @param x2 � ��������� ���� ��� ������� ��� ����� ��� �������
	 * @param y2 � ������ ���� ��� ������� ��� ����� ��� �������
	 * @param element2 �� ����� ��� ������� ��� �������
	 * @param board � ������� �� �� ������
	 * @param i � ���� ��� ������������� ��� ��������
	 * @return i � ���� ��� ������������� ��� ��������
	 * (�� i=1 ���� �� ����� ������,  �� i=2 �� ����� ����� , �� i=3 ���� ��������)
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
	 * (�� success=true ���� ������ �� ���� ���� ���� ���� ������ ���)
	 */
	public boolean moveTo(Piece element,int x1,int y1,int x2,int y2,boolean success,Piece[][] board){
		if((x1==x2+1 && y1==y2 )|| (y1==y2+1 && x1==x2) || (x1==x2-1 && y1==y2)|| y1==y2-1 && x1==x2)
			if(board[x1][y1]==null){
			
				System.out.println(board[x2][y2]);
			
			
			success=true;
			}
		
	return success;
	}

	
	/**
	 * accessor:���������� �� � ������ ��������� ���� ������� ���� ������ �� �������� ��� �����
	 * postcondition:������ �� ��������� �� � ������ ��������� ���� ������� ���� ������ �� �������� ��� �����
	 * @return position
	 */
	public boolean ResquePosition(int x, int y) {
		return false;
	}

	
	
	/**
	 * transformer:������ �� ����� ��������� ���� ����� ���� ������
	 * Postcondition:������� ���� ��������� numOfResques ��� ������ �� ������ ��� �������
	 * @param numOfResques
	 */
	public void SetNumberOfResques(int numOfResques) {
		this.numOfResques=numOfResques;
	}


	
	/**
	 * accessor:���������� ����� ��������� ���� ����� ���� ������
	 * postcondition:������ �� ���������� �� ����� ��������� ���� ����� ���� ������
	 * @return numOfResques
	 */
	public int getNumberOfResques() {
		return numOfResques;
	}





	




	






	

	

	

	

}