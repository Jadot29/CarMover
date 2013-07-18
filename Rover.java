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
    private char orientation;

    public Rover() {
        orientation = 'N';
        x = 1;
        y = 2;
    }

    public Rover(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public char getOrientation() {
        return orientation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void takeMoves(char[] movesArray) {
        for (char move : movesArray) {
            switch (orientation) {
                case 'N':{
                    switch (move) {
                        case 'M':
                            y += 1;
                            break;
                        case 'L':
                            orientation = 'W';
                            break;
                        case 'R':
                            orientation = 'E';
                            break;
                        default:break;
                    }
                    break;}
                case 'S': {
                    switch (move) {
                        case 'M':
                            y -= 1;
                            break;
                        case 'L':
                            orientation = 'E';
                            break;
                        case 'R':
                            orientation = 'W';
                            break;
                        default:       break;
                    }
                    break; }
                case 'W': {
                    switch (move) {
                        case 'M':
                            x -= 1;
                            break;
                        case 'L':
                            orientation = 'S';
                            break;
                        case 'R':
                            orientation = 'N';
                            break;
                        default:              break;
                    }
                    break;
                }
                case 'E': {
                    switch (move) {
                        case 'M':
                           x += 1;
                            break;
                        case 'L':
                            orientation = 'N';
                            break;
                        case 'R':
                            orientation = 'S';
                            break;
                        default:                    break;
                    }
                    break;
                }

            }

        }

    }
}