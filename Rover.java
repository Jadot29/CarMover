package com.example.MarsRover;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/17/13
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    private int x, y;
    private char charOrient;
    Mover orient;

    public Rover() {
        charOrient = 'N';
        x = 1;
        y = 2;
    }

    public Rover(int x, int y, char charOrient) {
        this.x = x;
        this.y = y;
        this.charOrient = charOrient;
    }

    public char getCharOrient() {
        return charOrient;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void updateRover(Rover rover) {
        charOrient = rover.getCharOrient();
        x = rover.getX();
        y = rover.getY();
    }

    public void takeMoves(char[] movesArray) {
        for (char move : movesArray) {
            movePosition(move);
        }
    }

    private void movePosition(char move) {
        HashMap<Character, Mover> facingMap = setUpMoverHashMap();
        Mover currentFacing = facingMap.get(charOrient);
        if(move == 'L'){
            currentFacing.turnLeft(this);

        }
        else if ( move == 'R')
        {
            currentFacing.turnRight(this);

        }
        else {
            currentFacing.moveForward(this);
        }

    }

    private HashMap<Character, Mover> setUpMoverHashMap() {
        HashMap<Character, Mover> facingMap = new HashMap<Character, Mover>();
        facingMap.put('N', new FacingNorth());
        facingMap.put('W', new FacingWest());
        facingMap.put('E', new FacingEast());
        facingMap.put('S', new FacingSouth());
        return facingMap;
    }


    public void setY(int y) {
        this.y = y;
        this.y = y;
    }

    public void setCharOrient(char charOrient) {
        this.charOrient = charOrient;
    }

    public void setX(int x) {

        this.x = x;
    }
}