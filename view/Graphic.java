package view;



import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;







import Controller.controller;
import Model.Board1;
import Model.ImmovablePiece;
import Model.MovablePiece;
import Model.Piece;
import Model.Player;
import Model.Scout;


public class Graphic extends JFrame{
	
	private controller game;
	private JPanel basic_panel=new JPanel();
	private JButton[][] buttons = new JButton[8][10];
	private boolean iconSelected;
	private JButton selectedButton;
	int x1,y1,x2,y2,i,j,att,letgo;
	private boolean success;
	private Board1 board1= new Board1();
	

	/**
	 * contructor:κατασκευαζει ενα Graphic με το πλαισιο του παιχνιδιου
	 * postcondition:δημιουργει και αρχικοποιει ενα νεο Graphic με το πλαισιο του παιχνιδιου
	 * @param string 
	 */
	public Graphic(){
	
		setTitle("Stratego");
		setVisible(true);
		setSize(800,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		basic_panel.setLayout(new GridLayout(8,10,2,10));
		game = new controller();
		validate();
		
	}
	
	
	
	/**
	 * observer:τοποθετει τα κουμπια στο πλαισιο με τις συντεταγμενες τους,οριζεται η ιδιοτητα τους να ακουνε το πατημα του Mouse 
	 * και τοποθετουνται οι εικονες των κουμπιων
	 * 
	 * postcondition:τοποθετει τα κουμπια στο πλαισιο με τις συντεταγμενες τους και οριζεται η ιδιοτητα τους να ακουνε το πατημα του Mouse
	 * και τοποθετουνται οι εικονες των κουμπιων
	 * @throws IOException 
	 * 
	 */
	public void InitiallizeComponents() throws IOException{
		
	for(int i=0;i<8;i++){
		for(int j=0;j<10;j++){
				buttons[i][j]= new JButton(i+","+j);
				buttons[i][j].setName(i+","+j);
				
				buttons[i][j].addMouseListener(new PieceListener());
		
			 basic_panel.add(buttons[i][j]);
			add(basic_panel);
			
	validate();
		}
		
	}
	
	
	
	Image img0 = ImageIO.read(getClass().getResource("/white.jpg"));
	buttons[3][2].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[3][0].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[4][0].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[3][1].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[4][1].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[3][4].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[4][4].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[3][5].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[4][5].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[3][8].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[4][8].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[3][9].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));
	buttons[4][9].setIcon(new ImageIcon(img0.getScaledInstance(80, 80,  Image.SCALE_SMOOTH)));


	}
	
	
	
	
		//// BLUE PIECES
	public void setBlueImages() throws IOException{
	
	
			Image img0 = ImageIO.read(getClass().getResource("/trapB.png"));
			
			buttons[2][0].setIcon(new ImageIcon(img0.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[0][7].setIcon(new ImageIcon(img0.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[1][0].setIcon(new ImageIcon(img0.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[1][4].setIcon(new ImageIcon(img0.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[1][2].setIcon(new ImageIcon(img0.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][7].setIcon(new ImageIcon(img0.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img1 = ImageIO.read(getClass().getResource("/dwarfB.png"));
			buttons[0][1].setIcon(new ImageIcon(img1.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[0][3].setIcon(new ImageIcon(img1.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[0][9].setIcon(new ImageIcon(img1.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][2].setIcon(new ImageIcon(img1.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][8].setIcon(new ImageIcon(img1.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));

			Image img2 = ImageIO.read(getClass().getResource("/scoutB.png"));
			buttons[0][2].setIcon(new ImageIcon(img2.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][1].setIcon(new ImageIcon(img2.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[1][1].setIcon(new ImageIcon(img2.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][3].setIcon(new ImageIcon(img2.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));

			
			Image img3 = ImageIO.read(getClass().getResource("/yeti.png"));
			buttons[0][4].setIcon(new ImageIcon(img3.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[0][8].setIcon(new ImageIcon(img3.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));

			
			Image img4 = ImageIO.read(getClass().getResource("/flagB.png"));
			buttons[0][5].setIcon(new ImageIcon(img4.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img5 = ImageIO.read(getClass().getResource("/sorceressB.png"));
			buttons[0][6].setIcon(new ImageIcon(img5.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][5].setIcon(new ImageIcon(img5.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img6 = ImageIO.read(getClass().getResource("/dragonB.png"));
			buttons[1][8].setIcon(new ImageIcon(img6.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img7 = ImageIO.read(getClass().getResource("/mageB.png"));
			buttons[1][3].setIcon(new ImageIcon(img7.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img8 = ImageIO.read(getClass().getResource("/elfB.png"));
			
			buttons[1][5].setIcon(new ImageIcon(img8.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][4].setIcon(new ImageIcon(img8.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img9 = ImageIO.read(getClass().getResource("/knightB.png"));
			buttons[1][6].setIcon(new ImageIcon(img9.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[2][6].setIcon(new ImageIcon(img9.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img10 = ImageIO.read(getClass().getResource("/beastRiderB.png"));
			
			buttons[1][7].setIcon(new ImageIcon(img10.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[1][9].setIcon(new ImageIcon(img10.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[0][0].setIcon(new ImageIcon(img10.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img11 = ImageIO.read(getClass().getResource("/slayerB.png"));
			buttons[2][9].setIcon(new ImageIcon(img11.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));


	}

				//////RED PIECES

public void setRedImages() throws IOException{
			Image img12 = ImageIO.read(getClass().getResource("/trapR.png"));
			buttons[5][0].setIcon(new ImageIcon(img12.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[5][7].setIcon(new ImageIcon(img12.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[6][0].setIcon(new ImageIcon(img12.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[6][4].setIcon(new ImageIcon(img12.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][1].setIcon(new ImageIcon(img12.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][7].setIcon(new ImageIcon(img12.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img13 = ImageIO.read(getClass().getResource("/dwarfR.png"));
			buttons[5][2].setIcon(new ImageIcon(img13.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[5][3].setIcon(new ImageIcon(img13.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[5][9].setIcon(new ImageIcon(img13.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][2].setIcon(new ImageIcon(img13.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][8].setIcon(new ImageIcon(img13.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));

			Image img14 = ImageIO.read(getClass().getResource("/scoutR.png"));
			buttons[5][1].setIcon(new ImageIcon(img14.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[6][2].setIcon(new ImageIcon(img14.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[6][8].setIcon(new ImageIcon(img14.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][3].setIcon(new ImageIcon(img14.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));

			
			Image img15 = ImageIO.read(getClass().getResource("/lavaBeast.png"));
			buttons[5][4].setIcon(new ImageIcon(img15.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[5][8].setIcon(new ImageIcon(img15.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));

			
			Image img16 = ImageIO.read(getClass().getResource("/flagR.png"));
			buttons[5][5].setIcon(new ImageIcon(img16.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img17 = ImageIO.read(getClass().getResource("/sorceressR.png"));
			buttons[5][6].setIcon(new ImageIcon(img17.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][5].setIcon(new ImageIcon(img17.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img18 = ImageIO.read(getClass().getResource("/dragonR.png"));
			
			buttons[6][1].setIcon(new ImageIcon(img18.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img19 = ImageIO.read(getClass().getResource("/mageR.png"));
			buttons[6][3].setIcon(new ImageIcon(img19.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img20 = ImageIO.read(getClass().getResource("/elfR.png"));
			buttons[6][5].setIcon(new ImageIcon(img20.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][4].setIcon(new ImageIcon(img20.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img21 = ImageIO.read(getClass().getResource("/knightR.png"));
			buttons[6][6].setIcon(new ImageIcon(img21.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][6].setIcon(new ImageIcon(img21.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			
			Image img22 = ImageIO.read(getClass().getResource("/beastRiderR.png"));
			
			buttons[6][7].setIcon(new ImageIcon(img22.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[6][9].setIcon(new ImageIcon(img22.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			buttons[7][0].setIcon(new ImageIcon(img22.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			
			
			Image img23 = ImageIO.read(getClass().getResource("/slayerR.png"));
			buttons[7][9].setIcon(new ImageIcon(img23.getScaledInstance(80, 80, Image.SCALE_SMOOTH)));

}

			
	
	
	
	/**
	 * οbserver:αρχικοποιει την εμφανιση των κουμπιων
	 * postcondition:αρχικοποιει ποια κουμπια θα φαινονται και ποια οχι
	 */
	public void InitiallizeButtons(){
		buttons[3][2].setVisible(false);
		buttons[4][2].setVisible(false);
		buttons[3][6].setVisible(false);
		buttons[4][6].setVisible(false);
		buttons[3][3].setVisible(false);
		buttons[4][3].setVisible(false);
		buttons[3][7].setVisible(false);
		buttons[4][7].setVisible(false);
		
		
		
      
	
	}	
	
	

	
    /**
     * transformer:θα κανει καποια ενεργεια οταν ενα κουμπι πατηθει 
     * Postcondition: κανει καποια ενεργεια οταν το κουμπι εχει πατηθει
     */
	private  class PieceListener implements MouseListener {
		
		


		
		@Override
        public void mouseClicked(MouseEvent e)  {
			
			Piece[][] board= board1.getBoard();

			JButton but = new JButton();
           but=((JButton)e.getSource());
           but.getName();
           
    
           for(i=0;i<8;i++){
        	   for(j=0;j<10;j++){
        		   if(but.getName().equals(i+","+j)){
        			   x1=i;
           				y1=j;
        		   }
        	   }
           }
          
           
   		
		if(iconSelected && !but.equals(selectedButton)){
			
			
	
			att=game.Make_An_Attack(board[x2][y2], x1, y1, x2, y2, board[x1][y1], board);

			
			/////////  		MOVE   ////////////////////
					if(att==0){
							success=game.Make_A_Move(board[x2][y2],x1, y1,x2,y2,board);
							
			
									if(board1.getElement(x2, y2) instanceof Scout){
										if((x1>=0 && x1<8 && y1==y2 )|| (y1>=0 && y1<10 && x1==x2))
												if(success==true){
 
													Icon icon= but.getIcon();
													but.setIcon(selectedButton.getIcon()); 
													selectedButton.setIcon(icon);
												
													 board1.setElement(board1.getElement(x2, y2),x1,y1);
													 board1.setElement(null, x2, y2);

													
													
															

	     	
	     	
	    
													selectedButton=but;
													iconSelected=false;
													success=false;
													System.out.println("pati8ike 2 fora");

												}
									}
			 
			 
									else if((x1==x2+1 && y1==y2 )|| (y1==y2+1 && x1==x2) || (x1==x2-1 && y1==y2)|| y1==y2-1 && x1==x2)
										if(success== true ){
	     	 

											Icon icon= but.getIcon();
											but.setIcon(selectedButton.getIcon()); 
											selectedButton.setIcon(icon);
					
											 board1.setElement(board1.getElement(x2, y2),x1,y1);
											 board1.setElement(null, x2, y2);
    
											selectedButton=but;
											iconSelected=false;
											success=false;
											System.out.println("pati8ike 2 fora");

										}
					}
				
		
/////////////////  TELOS MOVE///////////
		
		
//////////////// ATACK			////////////////
		
					else if(att==1){
			
			
						but.setIcon(selectedButton.getIcon()); 
						selectedButton.setIcon(buttons[3][2].getIcon());
					
						selectedButton=but;
						iconSelected=false;
						
						 board1.setElement(board[x2] [y2],x1,y1);
						 board1.setElement(null, x2, y2);

						

					}
		
					else if(att==3){
						selectedButton.setIcon(buttons[3][2].getIcon()); 
						but.setIcon(buttons[3][2].getIcon());

						selectedButton=but;
						iconSelected=false;
						
						board1.setElement(null,x1,y1);
						 board1.setElement(null, x2, y2);
						
					}
					else if(att==2){
						selectedButton.setIcon(buttons[3][2].getIcon()); 

						
						board1.setElement(null,x2,y2);
						 
						
						
						selectedButton=but;
						iconSelected=false;
					}
					
					
					else if(att==4){
						but.setIcon(buttons[3][2].getIcon());		
						
						 board1.setElement(null, x1, y1);
						 
						 selectedButton=but;
							iconSelected=false;
					}
					
					else if(att==6){
						selectedButton=but;
						iconSelected=false;
					}
					
					
					
					else if(att==5){
						but.setIcon(selectedButton.getIcon()); 
						selectedButton.setIcon(buttons[3][2].getIcon());
					
						selectedButton=but;
						iconSelected=false;
						
						 board1.setElement(board1.getElement(x2, y2),x1,y1);
						 board1.setElement(null, x2, y2);

						
					}
	
		}
		
		
		
		////////////////////  TELOS ATTACK   ///////////////

		 else if(!iconSelected && success==false){
			 System.out.println(board1.getElement(x1,y1));
			 if(board1.getElement(x1, y1) instanceof MovablePiece){
				
			 System.out.println("pati8ike mia fora");
		
			  x2=x1;
			  y2=y1;
			  
        		  iconSelected=true;
        		  selectedButton=but;
        	
        	  }
		
		
		 else if(board1.getElement(x1, y1) instanceof ImmovablePiece){
			 System.out.println("pati8ike Immovable");
			 iconSelected=false;
		 }
		
		
		 
		 }else 
                System.out.println("Already Selected");
			
		}
		
		
		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseReleased(MouseEvent e) throws NullPointerException {
			
		}               
	
	}
	
	
	
	
	///αφαιερεθεικε μεθοδος PressAnotherListener
	
		
	public static void main(String [] ar) throws IOException {
		Graphic stratego = new Graphic();
		stratego.InitiallizeComponents();
		stratego.InitiallizeButtons();
		stratego.setBlueImages();
		stratego.setRedImages();

		
		
		
	
	}

	
	


	
	}
