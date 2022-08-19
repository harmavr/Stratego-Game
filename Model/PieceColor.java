package Model;

public class PieceColor {
	private enum Color{RED,BLUE}
	private Color color;
	
	
	
	
	/**
	 * transformer:������ �� ����� �������
	 * postcondition:������� ���� ��������� color ��� ������ �� ������ ��� �������
	 * @param color �� ����� ��� �������
	 */
	public void setColor(Color color){
				this.color=color;
	}

	
	
	/**
	 * accessor:���������� �� ����� ��� �������
	 * postcondition:������ �� ���������� �� ����� ��� �������
	 * @return color
	 */
	public Color getColor(){
		return color;
	}
}
