package com.game.logic;

//********************************************************************
//CheckConditions.java is a class containing the 
//methods to check the user input,check for the winner 
//logic and to display the output  to play the game Rock-Scissors-Paper
//********************************************************************

import java.util.Scanner;

public class CheckConditions {

	private static int player1WinCounter;
	private static int player2WinCounter;
	private static int tieCounter;
	private static int invalidInput;
	public static final String INPUT_FOR_ROCK = "R";
	public static final String INPUT_FOR_SCISSORS = "S";
	public static final String INPUT_FOR_PAPER = "P";
	private Scanner scan;


	/*Method to capture the input from Player1
	Returns a String  */
	public  String captureInput() throws Exception{
		String input=INPUT_FOR_ROCK;//Input  -- "R", "P", or "S" 
		try {
			scan = new Scanner(System.in);
			input = scan.next();
		} catch (Exception e) {
			System.out.println("Inside the catch block of captureInput method \n");
			throw new Exception();
		}
		return input;
	}


	/*Method to check if the Player Input is valid or not
	  Takes Player input as parameter
	  Returns a String */
	public  String checkInput(String inputString) {
		String message = "";

		try {
			if(!inputString.equalsIgnoreCase(INPUT_FOR_ROCK) && !inputString.equalsIgnoreCase(INPUT_FOR_PAPER) && !inputString.equalsIgnoreCase(INPUT_FOR_SCISSORS)){
				System.out.println("Invaild Input ; Enter a valid input");
				message = "Invalid";
				invalidInput++;
			}else
				message = "Valid";
		} catch (Exception e) {
			System.out.println("Inside the catch block of checkInput method \n");
			e.printStackTrace();
		}
		return message;
	}


	/*Method to check winner condition
	  Takes Player1 and Player2 inputs as parameter*/
	public  void checkWinnerCondition(String player1,String player2) throws Exception{

		try {
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
		} catch (Exception e) {
			System.out.println("Inside the catch block of checkWinnerCondition method \n");
			throw new Exception();
		} 


	}


	/*Method to check the Final Winner
	  input parameters player1WinCount and player2WinCount
	  Returns a String */
	public  String checkFinalWinner(int player1Count,int player2Count){

		//default message when player1Count = player2Count
		String message = "Not Determined since Its a DRAW";

		if(player1Count > player2Count){
			message = "PLAYER1";
		}else if(player1Count < player2Count)
			message = "PLAYER2";
		return message;
	}

	/*Method to find the total number of games played
	  input parameters player1WinCount,player2WinCount and tiecount
	  Returns an int */
	public  int totalNumberOfGames(int player1Count,int player2Count,int tieCount){

		int totalNoGames = player1Count + player2Count + tieCount;
		return totalNoGames ;
	}

	/*Method to display the final results */
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
