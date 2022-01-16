package com.java.marsrover.v1;

/**
 * LocationWest class implements the Location interface.
 * It defines the movement of rover towards West direction as well as 
 * changing the direction of rover.
 */

public class LocationWest implements Location {

	Rover rover;
	
	public LocationWest(Rover rover){
		this.rover = rover;
	}
	
	
	public void move(String ctrlStr) {
	
		if(ctrlStr.equals("M")){
			if(isMoveAllowed()){
				System.out.println("Moving west...");
				rover.setX(rover.getX() - 1);
			}
			else{
				System.out.println(Location.MOVE_ERR_MSG);
			}
		}
		else if(ctrlStr.equals("L")){
			rover.setLoc(rover.getlocSouth());
		}
		else if(ctrlStr.equals("R")){
			rover.setLoc(rover.getlocNorth());
		}
					
	}
	
	public boolean isMoveAllowed(){
		if(rover.getX() > rover.getLowerLeftX()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		 
		return "W";
	}


}
