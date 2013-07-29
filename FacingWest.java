package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingWest implements Mover {

    public Rover turnRight(Rover rover) {
        rover.setCharOrient('N');
        return rover;
    }

    public Rover turnLeft(Rover rover) {
        rover.setCharOrient('S');
        return rover;
    }

    public Rover moveForward(Rover rover) {
        rover.setX(rover.getX() - 1);
        return rover;
    }
}
