package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/26/13
 * Time: 11:55 AM
 * To change this template use File | Settings | File Templates.
 */
public interface AdjustPosition {

    public Rover turn(Rover rover);

    public Rover moveUp(Rover rover);

    public Rover moveDown(Rover rover);
}
