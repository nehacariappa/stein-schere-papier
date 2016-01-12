package com.game.junit;

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
