package com.java.marsrover.v1;

/**
 * @author richajain
 * 2007
 * 
 * This is a Plateau class. It contains the lower left and upper right coordinates of Plateau.
 * 
 */
public class Plateau{
	
	private int lowerX = 0;
	private int lowerY = 0;
	private int upperX, upperY;
	

	public Plateau(){
		
	}
	
	public Plateau(String coord){
		
		String arrCoord[] = coord.split(" ");
		setUpperX(Integer.parseInt(arrCoord[0]));
		setUpperY(Integer.parseInt(arrCoord[1]));
	}
	
	/**
	 * This method returns the upperX coordinate of plateau.
	 * @return upperX
	 */
	public int getUpperX() {
		return upperX;
	}
	/**
	 * This method sets the upper right x coordinate of plateau.
	 * @param upperX
	 */
	public void setUpperX(int upperX) {
		this.upperX = upperX;
	}
	/**
	 * This method returns the upper right y coordinate of the plateau.
	 * @return upperY.
	 */
	public int getUpperY() {
		return upperY;
	}
	/**
	 * This method sets the upper right y coordinate of the plateau.
	 * @param upperY The upperY to set.
	 */
	public void setUpperY(int upperY) {
		this.upperY = upperY;
	}
}
