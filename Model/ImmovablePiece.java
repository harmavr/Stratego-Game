package Model;

public class ImmovablePiece extends Piece {

	
	
	/**
	 * constructor:������������ ��� ��� �mmovable Piece
	 * postcondition:���������� ��� ���������� ��� ��� Immovable Piece �� �� ����� ��������������
	 * @param exist ��� ���������� �� ������� �� �����
	 * @param power � ������ ��� �������
	 * @param position � ���� ��� �������
	 * @param color �� ����� ��� �������
	 */
	public ImmovablePiece(boolean exist) {
		super(exist);
	}

	
	public boolean hasSurvived(){
		return live;
	}
	
	
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	

}
