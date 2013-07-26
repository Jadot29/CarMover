package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/26/13
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class MoveUp {

    public Rover moveUp(Rover rover) {
        rover.setY(rover.getY() + 1);
        return rover;
    }


}
