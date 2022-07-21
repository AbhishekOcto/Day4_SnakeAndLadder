package com.bridgelabz.snakeAndLadder;

      public class UC4_Repeat extends UC3_player_option {
		/*Repeat till the Player
reaches the winning
position 100.*/
    	  
    	  static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;
		
		public static void main(String[] args) {
			int position = new UC1_getPosition().position;
			
			while(position < 100) {
				
				switch(getOption()) {
					case NOPLAY:
						position = position;
						break;
					case SNAKE:
						position -= getDiceRoll();
						break;
					case LADDER:
						position += getDiceRoll();
						break;	
				}
				
				if(position < 0) {
					position = 0;
				}
			}
			System.out.println("position = "+position);	
		}
}
