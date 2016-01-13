package com.game.logic;

// *********************************************
// GameLogic.java is a class containing the 
// logic to play the game Rock-Scissors-Paper
// ********************************************* 


public class GameLogic 
{ 

	public static void main(String[] args)  
	{ 
		try {
			String player1;
			String player2 = "R"; //Player2 has always "R"
			int numberOfGames=0;
			int iteration = 9; //Game will be played for 100 iterations
			String message;

			CheckConditions checkconditions = new CheckConditions();
			
			for(;numberOfGames<=iteration;){

				System.out.println("-----------------------------------------------------------------------------------------");	
				System.out.println("Let's play Rock, Paper, Scissors!\n" + 
						"Please enter a move.\n" + "Rock = R, Paper" + 
						"= P, and Scissors = S.");
				System.out.println();


				//Get Player1's move from the input
				System.out.println("Enter your play: "); 
				player1  =checkconditions.captureInput();

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
		} catch (Exception e) {
			System.out.println("Inside the catch block of GameLogic\n");
			e.printStackTrace();
		}

	}

}