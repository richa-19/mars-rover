
/**
 * @author richajain
 * 2007
 * 
 * The Rover class defines the attributes of rover and functions of rover for exploring the plateau.
 */

package com.java.marsrover.v1;
import java.util.Set;
import java.util.HashSet;


public class Rover{

	private int x,y, uprRtx, uprRty;
	Location loc;
	
	/**
	 * Four heading locations of the rover.
	 */
	LocationNorth locNorth;
	LocationSouth locSouth;
	LocationEast locEast;
	LocationWest locWest;
	
	final int lowerLeftX =0;
	final int lowerLeftY =0;
	int uprRightX, uprRightY;
	
	
	
	public Rover(){
		init();
	}
	
	public Rover(String startPos){
		
		init();		
		setRoverPosition(startPos);
		
	}
	
	public void init(){
		locNorth = new LocationNorth(this);
		locSouth = new LocationSouth(this);
		locEast = new LocationEast(this);
		locWest = new LocationWest(this);
	}
	
	/**
	 * This method sets the initial position of rover.
	 * @param startPosition string
	 */
	public void setRoverPosition(String startPosition){
		
		String startPos[] = startPosition.split(" ");
		
		setX(Integer.parseInt(startPos[0]));
		setY(Integer.parseInt(startPos[1]));
		
		if(startPos[2].equals("N"))
			loc = locNorth;
		else if(startPos[2].equals("S"))
			loc = locSouth;
		else if(startPos[2].equals("E"))
			loc = locEast;
		else if(startPos[2].equals("W"))
			loc = locWest;
		
	}
	
	/**
	 * This method retuns the current heading direction of rover. 
	 */
	public String getDirection() {
		return loc.toString();
	}
	
	/**
	 * This method takes the instruction string as parameter for rover
	 * to explore the plateau. It calls the update location method of 
	 * Location object.
	 * @param strInstr
	 */
	public void explorePlateau(String strInstr){
		
		char instr[] = strInstr.toCharArray();
		
		for(int i = 0; i < strInstr.length(); i++){
	
			loc.move(String.valueOf(instr[i]));
		}
	}
	
	public String toString(){
		
			return getX()+" "+getY()+" "+getDirection();
	}
	
	public void showCurrentPosition(){
	
		System.out.println(this);
	}
	
	
	/**
	 * @return Returns the lowerLeftX.
	 */
	public int getLowerLeftX() {
		return lowerLeftX;
	}
	/**
	 * @return Returns the lowerLeftY.
	 */
	public int getLowerLeftY() {
		return lowerLeftY;
	}
	/**
	 * @return Returns the uprRightX.
	 */
	public int getUpperRightX() {
		return uprRightX;
	}
	/**
	 * @param uprRightX The uprRightX to set.
	 */
	public void setUprRightX(int uprRightX) {
		this.uprRightX = uprRightX;
	}
	/**
	 * @return Returns the uprRightY.
	 */
	public int getUprRightY() {
		return uprRightY;
	}
	/**
	 * @param uprRightY The uprRightY to set.
	 */
	public void setUprRightY(int uprRightY) {
		this.uprRightY = uprRightY;
	}
	
	public Set SET = new HashSet();
	
	/**
	 * @return Returns the loc.
	 */
	public Location getLoc() {
		return loc;
	}
	/**
	 * @param loc The loc to set.
	 */
	public void setLoc(Location loc) {
		this.loc = loc;
	}
	/**
	 * @return Returns the locEast.
	 */
	public LocationEast getlocEast() {
		return locEast;
	}
	/**
	 * @param locEast The locEast to set.
	 */
	public void setlocEast(LocationEast locEast) {
		this.locEast = locEast;
	}
	/**
	 * @return Returns the locNorth.
	 */
	public LocationNorth getlocNorth() {
		return locNorth;
	}
	/**
	 * @param locNorth The locNorth to set.
	 */
	public void setlocNorth(LocationNorth locNorth) {
		this.locNorth = locNorth;
	}
	/**
	 * @return Returns the locSouth.
	 */
	public LocationSouth getlocSouth() {
		return locSouth;
	}
	/**
	 * @param locSouth The locSouth to set.
	 */
	public void setlocSouth(LocationSouth locSouth) {
		this.locSouth = locSouth;
	}
	/**
	 * @return Returns the locWest.
	 */
	public LocationWest getlocWest() {
		return locWest;
	}
	/**
	 * @param locWest The locWest to set.
	 */
	public void setlocWest(LocationWest locWest) {
		this.locWest = locWest;
	}
	/**
	 * @return Returns the uprRtx.
	 */
	public int getUprRtx() {
		return uprRtx;
	}
	/**
	 * @param uprRtx The uprRtx to set.
	 */
	public void setUprRtx(int uprRtx) {
		this.uprRtx = uprRtx;
	}
	/**
	 * @return Returns the uprRty.
	 */
	public int getUprRty() {
		return uprRty;
	}
	/**
	 * @param uprRty The uprRty to set.
	 */
	public void setUprRty(int uprRty) {
		this.uprRty = uprRty;
	}
	/**
	 * @return Returns the x.
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x The x to set.
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return Returns the y.
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y The y to set.
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public void setCurrPos(String pos){
		
	
	}
	
	
}
