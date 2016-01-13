package com.game.junit;

//**********************************************************************
//TestCheckFinalWinner.java is a junit testcase to find the final winner
//**********************************************************************

import static org.junit.Assert.*;

import org.junit.Test;

import com.game.logic.CheckConditions;


public class TestCheckFinalWinner {
		
		CheckConditions checkConditions = new CheckConditions();
		String message = checkConditions.checkFinalWinner(2,1);
		String testMessage = "PLAYER1";
		
		
		@Test
		public void testCheckFinalWinner(){
			
			System.out.println("@Test testCheckFinalWinner(): " + message + " = " + testMessage);
			assertEquals(message, testMessage);
		}

		
}
