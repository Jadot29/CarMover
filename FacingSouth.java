package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/25/13
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class FacingSouth  implements Mover {

    public Rover move(Rover rover, char move) {
        switch (move) {
            case 'M':
                rover.setY(rover.getY()-1);
                break;
            case 'L':
                rover.setCharOrient('E');
                break;
            case 'R':
                rover.setCharOrient('W');
                break;
            default:
                break;
        }
        return  rover;
    }

}
