package com.example.MarsRover;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingNorth  {
//    HashMap<Character,Rover> adjustPosition = new HashMap<Character,Rover>();
//    Rover rover = new Rover();
//                           adjustPosition.put('M', new MoveUp().moveUp(rover));

    public Rover  move(Rover rover, char move) {
        switch (move) {
            case 'M':
                rover = new MoveUp().moveUp(rover);
                break;
            case 'L':
                rover = new AdjustPositionLeft().turn(rover);
                break;
            case 'R':
                rover = new TurnLeft().turn(rover);
                break;
            default:
                break;
        }
        return rover;
    }

}
