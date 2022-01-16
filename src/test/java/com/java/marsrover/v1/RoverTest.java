package com.java.marsrover.v1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RoverTest {

	@Test
	void testRover1() {
		Rover rover1 = getRover("5 5");
		
		String instr1 = new String("LMLMLMLMM");
		
		rover1.setRoverPosition("1 2 N");
		System.out.println("\nInitial position of rover1: "+rover1);
		System.out.println("Sending instructions to rover 1: "+instr1);
		rover1.explorePlateau(instr1);
		
		assertEquals("1 3 N", rover1.toString());
		
		System.out.println("\nFinal position of rover1 : "+rover1);
	}

	@Test
	void testRover2() {
		Rover rover2 = getRover("5 5");
		
		String instr2 = new String("MMRMMRMRRM");
		
		rover2.setRoverPosition("3 3 E"); 
		System.out.println("\nInitial position of rover2: "+rover2);
		System.out.println("Sending instructions to rover 2: "+instr2);
		rover2.explorePlateau(instr2);
		
		assertEquals("5 1 E", rover2.toString());
		
		System.out.println("\nFinal position of rover2 : "+rover2);
		
	}
	
	private Rover getRover(String coord) {
		Plateau marsPlateau = new  Plateau(coord);
		Rover rover = new Rover();
		
		rover.setUprRightX(marsPlateau.getUpperX());
		rover.setUprRightY(marsPlateau.getUpperY());
		return rover;
	}

}
