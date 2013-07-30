package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingNorth  implements Facing {

    public Rover moveForward(Rover rover){
        rover.setY(rover.getY()+1);
        return rover;
    }

    public Facing turnLeft() {
        return new FacingWest();
    }

    public Facing turnRight() {
        return new FacingEast();
    }


    public String name() {
        return "North";
    }

}
