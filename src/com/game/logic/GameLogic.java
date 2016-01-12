package com.game.logic;

// *********************************************
// GameLogic.java is a class containing the 
// logic to play the game Rock-Scissors-Paper
// ********************************************* 


import java.util.Scanner; 


public class GameLogic 
{ 
	private static Scanner scan;

	public static void main(String[] args)  
	{ 
		String player1;//Input  -- "R", "P", or "S" 
		String player2 = "R"; //Player2 has always "R"
		int numberOfGames=0;
		int iteration = 3;
		String message;

		CheckConditions checkconditions = new CheckConditions();

		scan = new Scanner(System.in); 

		for(;numberOfGames<=iteration;){

			System.out.println("-----------------------------------------------------------------------------------------");	
			System.out.println("Let's play Rock, Paper, Scissors!\n" + 
					"Please enter a move.\n" + "Rock = R, Paper" + 
					"= P, and Scissors = S.");
			System.out.println();


			//Get Player1's move from the input-- note that this is 
			// stored as a string 
			System.out.println("Enter your play: "); 
			player1 = scan.next();

			//Check if the input is valid;if not the player1 is asked to enter 
			//the input again
			message= checkconditions.checkInput(player1);
			if(message == "Invalid"){
				continue;
			}

			//Print Player2's Move 
			System.out.println("Player 2 has : " + player2); 

			//Check for the winner´s condition
			checkconditions.checkWinnerCondition(player1,player2);
			numberOfGames++;
		}
        //Display the output
		checkconditions.displayOutput();

	}



}