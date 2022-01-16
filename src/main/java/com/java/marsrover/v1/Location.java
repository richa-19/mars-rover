package com.java.marsrover.v1;


/**
 * 
 * @author richajain 
 * 2007
 *
 */
public interface Location{
	
	/*
	* This message is displayed when the rover tries to move beyond plateau boundaries.
	*/
	public static final String MOVE_ERR_MSG="Can not move beyond limits";
	
	/*
	 * This method will update the location of rover depepnding on the 
	 * control string 'ctrlStr' 
	 */
	public void move(String ctrlStr);
	
	/*
	 * This method checks if the rover can move forward in the specified 
	 * direction or not. It returns a boolean value.
	 */
	public boolean isMoveAllowed();

}