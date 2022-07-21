package com.bridgelabz.snakeAndLadder;
import java.util.Random;
public class UC3_player_option extends UC2_DiceRoll {
	/*The Player then checks for
a Option. They are No Play,
Ladder or Snake.*/	
	
	static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;
		
		static int getOption() {
			Random random = new Random();
			int option = random.nextInt(3);
			return option;
		}
		
		public static void main(String[] args) {
			int position = new UC1_getPosition().position;
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
			System.out.println("Player position = "+position);
		}
	
	
}
