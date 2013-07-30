package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingSouth  implements Facing {

    public Rover moveForward(Rover rover) {
        rover.setY(rover.getY()-1);
        return rover;
    }

    public Facing turnLeft() {
        return new FacingEast();
    }


    public Facing turnRight() {
        return new FacingWest();
    }


    public String name() {
    return "South";
    }


}
