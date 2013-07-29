package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Mover {

    public Rover moveForward(Rover rover) ;
    public Rover turnLeft(Rover rover);
    public Rover turnRight(Rover rover);

}
