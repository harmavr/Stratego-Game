package Controller;



import Model.Board1;
import Model.Piece;
import Model.Player;



public  class controller {
	
	
	private Player player2 = new Player("EverWinter",false);
	private Board1 board1;
	private Player player1=new Player("Volcandira",false);

	
	
	/**
	 * constructor:������������ ��� ��� Controller ��� ��� ������ player1
	 * Postcondition:���������� ��� ����������� ��� ��� Controller ��� ��� ������ player1
	 * ����� ����� ����� �������, ���������� �� board
	 */
	public controller(){
		
		Player player1= new Player("Volcandria",false);
	

		
	}
	
	
	
	/**
	 * transformer:���� ������� ����� �������
	 * Postcondition:� ������� ����� �������
	 * @param element �� ����� ��� ����� �������
	 * @param x1 � ��������� ���� ��� ������� ��� ������� �������
	 * @param y1 � ������ ���� ��� ������� ��� ������� �������
	 * @param x2 � ��������� ���� ��� ������� ��� ����� ��� �������
	 * @param y2 � ������ ���� ��� ������� ��� ����� ��� �������
	 * @param element2 �� ����� ��� ������� ��� �������
	 * @param board � ������� �� �� ������
	 * @return i � ���� ��� ������������� ��� ��������
	 */
	public int Make_An_Attack(Piece element,int x1, int y1,int x2,int y2,Piece element2,Piece[][]board){
	int i=player1.PlayerAttack(element, x1, y1, x2, y2, element2, board);
	//System.out.println(i);
	return i;
	}
	
	
	/**
	 * transformer:���s ������� ��������� �� �����
	 * postcondition:���� ������� ���������� � ����� ���
	 @param element �� ����� ��� ������������
	 * @param x1 � ��������� ���� ��� ������� ��� �� ���� �� �����
	 * @param y1 � ������ ���� ��� ������� ��� �� ���� �� �����
	 * @param x2 � ��������� ���� ��� ������� ��� ������������
	 * @param y2 � ������ ���� ��� ������� ��� ������������
	 * @param element2 � ���� ��� �� ���� �� �����
	 * @param board � ������� �� �� ������
	 * @return successMove � ���� ��� ������������� ��� �����������
	*/
	public boolean Make_A_Move(Piece element,int x1, int y1,int x2,int y2,Piece[][]board){
		 boolean successMove=player1.PlayerMove(element, x1, y1,x2,y2,board);
		 
	
		return successMove;
			
	}
	
	
	
	
	
	/**
	 * tranformer:������� ���� �������
	 * postcondition:� ������� ������� �� ������ ��� ������ ��� ���� �� ������ ��� ����� ����� ��� ���� ��� �� ����� ���� ��� ��������
	 * @param pieceOffBoard
	 */
	//public void Resque_A_Piece(Piece pieceOffBoard){
	//	pieceOnBoard.add(pieceOffBoard);
	//}
	
	/**
	 * �bserver:���������� �� � ������� ���� ��������� �� ���� ���
	 * postcondition:������ �� ���������� �� � ������� ���� ��������� ��� ���� ���
	 * @return
	 */
//	public boolean PlayerHasPlayed(){
	//	return playerhasplayed;
	//}
	

}
