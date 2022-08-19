package Model;

public class Turn {
	
	private int turn;
	private int lastplayer;
	private Player player;
	

	/**
	 * constructor:������������ ��� ��� Turn
	 * postcondition:���������� ��� ����������� ��� ��� Turn �� �� ����� ��������������
	 * @param turn � ����� ��� ������(turn 1 ���� � ���� ��� turn 2 ���� � ��������)
	 */
	public Turn(int turn){
		this.turn=turn;
		this.lastplayer=0;
	}
	
	
	/**
	 * transformer:������ ��� ��� ����
	 * postcondition:������� ���� ��������� turn ��� ������ �� ������ ��� �������
	 * @param turn
	 */
	public void setTurn(int turn){
		if(turn==1 && !player.getHasPlayed()){
		this.turn=1;
		this.lastplayer=0;
		}
		
		else if(turn==1 && player.getHasPlayed()){
			this.turn=2;
			this.lastplayer=1;
			player.setHasPlayed(true);
		}
		
		else if(turn==2 && !player.getHasPlayed()){
			this.turn=2;
			this.lastplayer=1;
		}
		
		else if(turn==2 && player.getHasPlayed()){
			this.turn=1;
			this.lastplayer=2;
			player.setHasPlayed(true);
		}
	}
	
	
	/**
	 * accessor:���������� �� ���� ��� ������
	 * postcondition:������ �� ���������� �� ���� ��� ������
	 * @return
	 */
	public int getTurn(){
		return turn;
	}

}
