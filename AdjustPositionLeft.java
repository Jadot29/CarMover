package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/26/13
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class AdjustPositionLeft implements AdjustPosition {
    public Rover turn(Rover rover) {
        rover.setCharOrient('W');
        return rover;
    }

    public Rover moveUp(Rover rover){return rover;}
    public Rover moveDown(Rover rover){return rover;}

}
