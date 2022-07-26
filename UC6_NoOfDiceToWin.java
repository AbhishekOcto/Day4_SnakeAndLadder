package com.bridgelabz.snakeAndLadder;

public class UC6_NoOfDiceToWin extends UC3_player_option {
	/*Report the number of
times the dice was
played to win the game
and also the position
after every die role*/
		static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;
		
		public static void main(String[] args) {
			int position = new UC1_getPosition().position;
			int cnt = 0, diceroll;
			
			while(position < 100) {
				
				diceroll = getDiceRoll();
				
				switch(getOption()) {
					case NOPLAY:
						position = position;
						break;
					case SNAKE:
						position -= diceroll;
						break;
					case LADDER:
						position += diceroll;
						break;	
				}
				
				if(position < 0) {
					position = 0;
				}
				else if(position > 100 ) {
					position -= diceroll;
				}
				cnt++;
				System.out.println("position of player = "+position);	
			}
			System.out.println("Number of dice required to win = "+cnt);
			
		}
	
}
