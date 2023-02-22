package com.credersi.animals;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testRuns() {
		Cat cat = new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	
	@Test
	public void testFeeds() {
		Cat cat = new Cat();
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	
	@Test
	public void testFeedsAndRuns() {
		Cat cat = new Cat();
		cat.feeds();
		cat.runs();
		assertEquals(cat.howHungry(), 60);
	}
	
	@Test
	public void testRunsTooMuch() {
		Cat cat = new Cat();
		while(cat.isAlive() == true) {
			cat.runs();
		}
		assertEquals(cat.isAlive(), false);
	}
	
	@Test
	public void testEatsALot() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	
	@Test
	public void testTooMuchTrainingMakesCatADullBoy() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		while (cat.isAlive() == true) {
			cat.runs();
			cat.feeds();
			//System.out.println(cat.hunger);
		}
		//System.out.println(cat.hunger);
		assertEquals(cat.isAlive(), false);
	}
	
	@Test
	public void testAttemptedNecromancy() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		cat.feeds();
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testHungerResetAfterDeath() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testReducingLives1() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives2() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 1) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives3() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 2) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives4() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 3) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives5() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 4) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives6() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 5) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives7() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 6) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives8() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 7) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), true);
	}
	
	@Test
	public void testReducingLives9() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 8) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertTrue(cat.isAlive());
	}
	
	@Test
	public void testReducingLives10() {
		Cat cat = new Cat();
		int i = 0;
		while(i < 9) {
		cat.runs();
		cat.runs();
		i++;
		}
		assertEquals(cat.isAlive(), false);
	}
}