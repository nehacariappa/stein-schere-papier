package com.game.junit;

//********************************************************************
//TestCheckInput.java is a junit testcase to test the Player´s input
//********************************************************************

import static org.junit.Assert.*;

import org.junit.Test;

import com.game.logic.CheckConditions;


public class TestCheckInput {
		
		CheckConditions checkConditions = new CheckConditions();
		String message = checkConditions.checkInput(CheckConditions.INPUT_FOR_PAPER);
		String testMessage = "Valid";

		@Test
		public void test() {
			System.out.println("@Test testCheckInput(): " + message + " = " + testMessage);
			assertEquals(message, testMessage);
		}

}
