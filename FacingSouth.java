package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingSouth  implements Mover {

    public Rover moveForward(Rover rover) {
        rover.setY(rover.getY()-1);
        return rover;
    }

    public Rover turnLeft(Rover rover) {
        rover.setCharOrient('E');
        return rover;
    }

    public Rover turnRight(Rover rover) {
        rover.setCharOrient('W');
        return rover;
    }
}
