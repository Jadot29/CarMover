package com.example.MarsRover;


/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/17/13
 * Time: 9:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    private int x, y;
    private Facing currentFacing;

    public Rover(int x, int y, Facing facing) {
        this.x = x;
        this.y = y;
        this.currentFacing = facing;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void takeMoves(char[] movesArray) {
        for (char move : movesArray) {
            movePosition(move);
        }
    }

    private void movePosition(char move) {
        if(move == 'L'){
            currentFacing = currentFacing.turnLeft();
        }
        else if ( move == 'R')
        {
            currentFacing = currentFacing.turnRight();
        }
        else {
            currentFacing.moveForward(this);
        }

    }


    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printRoverPosition(){
        System.out.println(x + " " + y + " " + currentFacing.name());
    }

    public Facing getCurrentFacing() {
        return currentFacing;
    }
}