package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingNorth  implements Mover{
//    HashMap<Character,Rover> adjustPosition = new HashMap<Character,Rover>();
//    Rover rover = new Rover();
//                           adjustPosition.put('M', new MoveUp().moveUp(rover));

    public Rover  move(Rover rover, char move) {
        switch (move) {
            case 'M':
                rover = new MoveUp().moveUp(rover);
                break;
            case 'L':
                rover = new TurnLeft().turn(rover);
                break;
            case 'R':
                rover = new TurnRight().turn(rover);
                break;
            default:
                break;
        }
        return rover;
    }

    public Rover turnLeft(Rover rover) {
        rover.setCharOrient('W');
        return rover;
    }

    public Rover turnRight(Rover rover) {
        rover.setCharOrient('E');
        return rover;

    }

}
