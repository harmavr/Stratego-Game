package Model;


public  class Piece {
	
	protected boolean live;
	protected int power;
	private int x,y;
	protected Model.Board1.PieceColor color;


/**
 * constructor:������������ ��� ��� ����� �� �� ����� ��������������
 * postcondition:���������� ��� ����������� ��� ��� ����� �� �� ����� ��������������
 * @param live ���������� �� �� ����� ��� � ��� 
 */
	Piece(boolean live){
	this.live=live;
		

	}
	
	
	/**
	 * accessor:���������� �� ��� �� �����
	 * postcondition:������ �� ���������� �� ��� �� �����
	 * @return name
	 */
	public boolean getHasSurvived(){
		return live;
	}
	
	
	
	/**
	 * transformer:������ �� ��� �� �����
	 * postcondition:������� ���� ��������� live ��� ������ �� ������ ��� �������
	 * @param live
	 */
	public void setHasSurvived(boolean live){
		this.live=live;
	}
	
	
	/**
	 * accessor:���������� �� ������ ��� ��������
	 * postcondition:������ �� ���������� �� ������ ��� �������
	 * @return power
	 */
	public int getPower(){
		return power;
	}
	

	
	/**
	 * transofrmer:������ �� ������ ��� �������
	 * postcondition:������� ���� ��������� power ��� ������ �� ������ ��� �������
	 * @param power
	 */
	public void setPower(int power){
		this.power=power;
	}
	

	
	/**
	 * transformer:������ �� ���� ��� �������
	 * postcondition:������� ���� ��������� position ��� ������ �� ������ ��� �������
	 * @param potision
	 */
	public void setXposition(int x){
		this.x=x;
	}
	
	
	
	/**
	 * transformer:������ �� ���� ��� �������
	 * postcondition:������� ���� ��������� position ��� ������ �� ������ ��� �������
	 * @param potision
	 */
	public void setYposition(int y){
		this.y=y;
	}

	
	
	/**
	 * accessor:���������� �� ���� x ��� �������
	 * postcondition:������ �� ���������� �� ���� � ��� �������
	 * @return x
	 */
	public int getXposition(){
		return x;
	}
	
	
	
	
	/**
	 * accessor:���������� �� ���� y ��� �������
	 * postcondition:������ �� ���������� �� ���� y ��� �������
	 * @return y
	 */
	public int getYposition(){
		return y;
	}
	
	
	
	/**
	 * transformer:������ �� ����� ��� ��� �����
	 * Postcondition:������� ���� ��������� color ��� ������ �� ������ ��� ������
	 * @param color
	 */
	
	public void setColor(Model.Board1.PieceColor color){
		this.color=color;
	}
	
	
	/**
	 * accessor:���������� �� ����� ��� �������
	 * Postcondition:������ �� ���������� �� ����� ��� �������
	 * @return color
	 */
	public  Model.Board1.PieceColor getColor(){
		return color;
	}


	

	
}
