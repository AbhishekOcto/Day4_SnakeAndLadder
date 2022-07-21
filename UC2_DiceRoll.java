package com.bridgelabz.snakeAndLadder;
import java.util.Random;
public class UC2_DiceRoll {
	/*The Player rolls the die
to get a number
between 1 to 6.*/
	static int getDiceRoll() {
		int Dice_min = 1, Dice_max = 6;
		Random random = new Random();
		int Dice = random.nextInt(Dice_max - Dice_min + 1)+Dice_min;
		return Dice;
	}
	public static void main(String[] args) {
		System.out.println(getDiceRoll());

	}
	
}
