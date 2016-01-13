package com.game.junit;

//***********************************************************************************
//TestNumberOfGames.java is a junit testcase to find the total number of games played
//***********************************************************************************


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.game.logic.CheckConditions;

public class TestNumberOfGames {
	
	CheckConditions checkConditions = new CheckConditions();
	int count = checkConditions.totalNumberOfGames(1, 2, 2);
	int testCount = 5;

	@Test
	public void test() {
		System.out.println("@Test testNumberOfGames(): " + count + " = " + testCount);
		assertEquals(count, testCount);
	}


}
