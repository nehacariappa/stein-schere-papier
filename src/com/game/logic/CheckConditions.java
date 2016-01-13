package com.game.logic;

import java.util.Scanner;

public class CheckConditions {

	private static int player1WinCounter;
	private static int player2WinCounter;
	private static int tieCounter;
	private static int invalidInput;
	private String INPUT_FOR_ROCK = "R";
	private String INPUT_FOR_SCISSORS = "S";
	private String INPUT_FOR_PAPER = "P";


	/*Method to capture the input from Player1
	Returns a String  */
	public  String captureInput(){
		String input;//Input  -- "R", "P", or "S" 
		Scanner scan = new Scanner(System.in);
		input = scan.next();

		return input;
	}



	/*Method to check if the Player Input is valid or not
	  Takes Player input as parameter
	  Returns a String */
	public  String checkInput(String inputString){
		String message;
		
		if(!inputString.equalsIgnoreCase(INPUT_FOR_ROCK) && !inputString.equalsIgnoreCase(INPUT_FOR_PAPER) && !inputString.equalsIgnoreCase(INPUT_FOR_SCISSORS)){
			System.out.println("Invaild Input ; Enter a valid input");
			message = "Invalid";
			invalidInput++;
		}else
			message = "Valid";
		return message;
	}

	
	/*Method to check winner condition
	  Takes Player1 and Player2 inputs as parameter
	*/
	public  void checkWinnerCondition(String player1,String player2){

		if (player1.equalsIgnoreCase(player2)) {
			System.out.println("It's a tie!\n"); 
			tieCounter++;
		}
		else if (player1.equalsIgnoreCase(INPUT_FOR_ROCK)) {
			if (player2.equalsIgnoreCase(INPUT_FOR_SCISSORS)) {
				System.out.println("Rock crushes scissors. You win!!\n");
				player1WinCounter++;
			}
			else if (player2.equalsIgnoreCase(INPUT_FOR_PAPER)) {
				System.out.println("Paper eats rock. You lose!!\n"); 
				player2WinCounter++;
			}
		}
		else if (player1.equalsIgnoreCase(INPUT_FOR_PAPER)) {
			if (player2.equalsIgnoreCase(INPUT_FOR_SCISSORS)) {
				System.out.println("Scissor cuts paper. You lose!!\n"); 
				player2WinCounter++;
			}
			else if (player2.equalsIgnoreCase(INPUT_FOR_ROCK)) {
				System.out.println("Paper eats rock. You win!!\n"); 
				player1WinCounter++;
			}
		}
		else if (player1.equalsIgnoreCase(INPUT_FOR_SCISSORS)) {
			if (player2.equalsIgnoreCase(INPUT_FOR_PAPER)) {
				System.out.println("Scissor cuts paper. You win!!\n"); 
				player1WinCounter++;
			}
			else if (player2.equalsIgnoreCase(INPUT_FOR_ROCK)) {
				System.out.println("Rock breaks scissors. You lose!!\n"); 
				player2WinCounter++;
			}
		}
		else
			System.out.println("Invalid user input.\n"); 


	}

	//Final Winner Check with input parameters player1WinCount and player2WinCount
	public  String checkFinalWinner(int player1Count,int player2Count){

		//default message when player1Count = player2Count
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

	//function to display the final results
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
