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
            updateRover(movePosition(move,this.getX(),this.getY(),this.getCharOrient()));
        }
    }

    private Rover movePosition(char move,int x, int y , char charOrient) {
        HashMap<Character, Rover> position = new HashMap<Character, Rover>();
        position.put('N', new FacingNorth().move(new Rover(x,y,charOrient), move));
        position.put('W', new FacingWest().move(new Rover(x,y,charOrient), move));
        position.put('E', new FacingEast().move(new Rover(x,y,charOrient), move));
        position.put('S', new FacingSouth().move(new Rover(x,y,charOrient), move));
        return position.get(charOrient);
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