package com.game.logic;

public class CheckConditions {

	private static int player1WinCounter;
	private static int player2WinCounter;
	private static int tieCounter;
	private static int invalidInput;


	//Input String Check
	public  String checkInput(String inputString){
		String message;


		if(!inputString.equalsIgnoreCase("R") && !inputString.equalsIgnoreCase("P") && !inputString.equalsIgnoreCase("S")){
			System.out.println("Invaild Input ; Enter a valid input");
			message = "Invalid";
			invalidInput++;
		}else

			message = "Valid";
		return message;
	}

	//Winner Condition Check
	public  void checkWinnerCondition(String player1,String player2){

		if (player1.equalsIgnoreCase(player2)) {
			System.out.println("It's a tie!\n"); 
			tieCounter++;
		}
		else if (player1.equalsIgnoreCase("R")) {
			if (player2.equalsIgnoreCase("S")) {
				System.out.println("Rock crushes scissors. You win!!\n");
				player1WinCounter++;
			}
			else if (player2.equalsIgnoreCase("P")) {
				System.out.println("Paper eats rock. You lose!!\n"); 
				player2WinCounter++;
			}
		}
		else if (player1.equalsIgnoreCase("P")) {
			if (player2.equalsIgnoreCase("S")) {
				System.out.println("Scissor cuts paper. You lose!!\n"); 
				player2WinCounter++;
			}
			else if (player2.equalsIgnoreCase("R")) {
				System.out.println("Paper eats rock. You win!!\n"); 
				player1WinCounter++;
			}
		}
		else if (player1.equalsIgnoreCase("S")) {
			if (player2.equalsIgnoreCase("P")) {
				System.out.println("Scissor cuts paper. You win!!\n"); 
				player1WinCounter++;
			}
			else if (player2.equalsIgnoreCase("R")) {
				System.out.println("Rock breaks scissors. You lose!!\n"); 
				player2WinCounter++;
			}
		}
		else
			System.out.println("Invalid user input.\n"); 


	}

	//Final Winner Check
	public  String checkFinalWinner(int player1Count,int player2Count){

		String message = "Not Determined since Its a DRAW";

		if(player1Count > player2Count){
			message = "PLAYER1";
		}else if(player1Count < player2Count)
			message = "PLAYER2";
		return message;
	}


	public  int totalNumberOfGames(int player1Count,int player2Count,int tieCount){

		int totalNoGames = player1Count + player2Count + tieCount;
		return totalNoGames ;
	}

	//Final Winner Check
	public  void displayOutput(){

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Total games played " + totalNumberOfGames(player1WinCounter,player2WinCounter,tieCounter) );
		System.out.println("Player1 wins " + player1WinCounter + " times ");
		System.out.println("Player2 wins " + player2WinCounter + " times ");
		System.out.println("Its a Draw  " + tieCounter + " times\n");
		//System.out.println("Invalid Inputs  " + invalidInput  + "\n");
		System.out.println("********* THE WINNER IS " + checkFinalWinner(player1WinCounter,player2WinCounter) + " *********  \n");
		System.out.println("-----------------------------------------------------------------------------------------");


	}

}
