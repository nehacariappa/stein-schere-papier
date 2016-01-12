package com.game.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.game.logic.CheckConditions;


public class TestCheckInput {
		
		CheckConditions checkConditions = new CheckConditions();
		String message = checkConditions.checkInput("P");
		String testMessage = "Valid";

		@Test
		public void test() {
			System.out.println("@Test testCheckInput(): " + message + " = " + testMessage);
			assertEquals(message, testMessage);
		}

}
