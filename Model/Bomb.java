package Model;

public class Bomb extends ImmovablePiece{

	
	
	

	/**
	 * constructor:������������ ��� ��� Bomb
	 * postcondition:���������� ��� ����������� ��� ��� Bomb �� �� ����� ��������������
	 * @param exist �� ���
	 * @param power � ������
	 * @param x � ���������
	 * @param y � ������ ����
	 * @param color �� �����
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
