package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingWest implements Facing {


    public Rover moveForward(Rover rover) {
        rover.setX(rover.getX() - 1);
        return rover;
    }

    public Facing turnLeft() {
return new FacingSouth();
    }

    public Facing turnRight() {
        return new FacingNorth();
    }

    public String name() {
        return "West";
    }
}
