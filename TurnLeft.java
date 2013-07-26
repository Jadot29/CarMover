package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/26/13
 * Time: 11:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class TurnLeft implements AdjustPosition {
    public Rover turn(Rover rover) {
        rover.setCharOrient('E');
        return rover;

    }

    public Rover moveUp(Rover rover){return rover;}
    public Rover moveDown(Rover rover){return rover;}

}
