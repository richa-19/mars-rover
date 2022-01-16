# MARS ROVERS
## PROBLEM DESCRIPTION: 
A squad of robotic rovers are to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the
rovers so that their on-board cameras can get a complete view of the
surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y
co-ordinates and a letter representing one of the four cardinal compass
points. The plateau is divided up into a grid to simplify navigation. An
example position might be 0, 0, N, which means the rover is in the bottom
left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The
possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90
degrees left or right respectively, without moving from its current spot.
'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

INPUT:
The first line of input is the upper-right coordinates of the plateau, the
lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have
been deployed. Each rover has two lines of input. The first line gives the
rover's position, and the second line is a series of instructions telling
the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces,
corresponding to the x and y co-ordinates and the rover's orientation.

Each rover will be finished sequentially, which means that the second rover
won't start to move until the first one has finished moving.


OUTPUT
The output for each rover should be its final co-ordinates and heading.

INPUT AND OUTPUT

Test Input:
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM

Expected Output:
1 3 N
5 1 E

<br>

## SOLUTION
####Brief description of classes- 

* Plateau class contains the lower left and upper right coordinates of the plateau.
* Rover class implements the functionality and attributes of rover.It contains a reference for Location object.

* Location interface declares the functions for movement of rover. Its purpose is to update the orientation of rover, i.e, it’s heading direction and its position coordinates.
It has four concrete classes-
LocationNorth 
LocationSouth
LocationEast
LocationWest

Each of this class is responsible for moving the rover in respective direction and changing the heading direction accordingly.

####Test
RoverTest.java

Output -

Initial position of rover1: 1 2 N
Sending instructions to rover 1: LMLMLMLMM
Moving west...
Moving south...
Moving east...
Moving north...
Moving north...

Final position of rover1 : 1 3 N

Initial position of rover2: 3 3 E
Sending instructions to rover 2: MMRMMRMRRM
Moving east...
Moving east...
Moving south...
Moving south...
Moving west...
Moving east...

Final position of rover2 : 5 1 E
