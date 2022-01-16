package com.java.marsrover.v1;

/** 
 * @author richajain
 * 2007
 * 
 * LocationEast class implements the Location interface.
 * It defines the movement of rover towards East direction as well as 
 * changing the direction of rover.
 */

public class LocationEast implements Location {

	Rover rover;
	
	public LocationEast(Rover rover){
		this.rover = rover;
	}
	
	
	public void move(String ctrlStr) {
		
		if(ctrlStr.equals("M")){
			System.out.println("Moving east...");
			rover.setX(rover.getX() + 1);
		}
		else if(ctrlStr.equals("L")){
			rover.setLoc(rover.getlocNorth());
		}
		else if(ctrlStr.equals("R")){
			rover.setLoc(rover.getlocSouth());
		}
		 
	}
	
	public boolean isMoveAllowed(){
		if(rover.getX() < rover.getUpperRightX()){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	public String toString(){
		 
		return "E";
	}


}
