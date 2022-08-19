package Model;

public class Flag extends ImmovablePiece {
	
	
	/**
	 * constructor:������������ ��� ��� Flag
	 * postcondition:���������� ��� ����������� ��� ��� Flag �� �� ����� ��������������
	  * @param live �� ���
	 * @param power � ������
	 * @param x � ���������
	 * @param y � ������ ����
	 * @param color �� �����
	*/
	public Flag(boolean exist, int power, int x,int y,Model.Board1.PieceColor color) {
		super(exist);
	}

	
	public boolean getHasSurvived(){
		return live;
	}
	
	
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	
	
}