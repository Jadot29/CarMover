package com.example.MarsRover;

import com.example.MarsRover.MarsRover.Orient;

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
    Orient orient;

    public Rover() {
        orient = Orient.North;
        translateOrientation();
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

    public void translateOrientation() {
        switch (orient) {
            case North:
                charOrient = 'N';
                break;
            case South:
                charOrient = 'S';
                break;
            case West:
                charOrient = 'W';
                break;
            case East:
                charOrient = 'E';
                break;
            default:
                break;
        }
    }

    public void takeMoves(char[] movesArray) {
        for (char move : movesArray) {
            switch (charOrient) {
                case 'N': FacingNorth(move);
                break;
                case 'S': {
                    FacingSouth(move);
                    break;
                }
                case 'W': {
                    FacingWest(move);
                    break;
                }
                case 'E': {
                    FacingEast(move);
                    break;
                }

            }

        }

    }

    private void FacingEast(char move) {
        switch (move) {
            case 'M':
                x += 1;
                break;
            case 'L':
                charOrient = 'N';
                break;
            case 'R':
                charOrient = 'S';
                break;
            default:
                break;
        }
    }

    private void FacingWest(char move) {
        switch (move) {
            case 'M':
                x -= 1;
                break;
            case 'L':
                charOrient = 'S';
                break;
            case 'R':
                charOrient = 'N';
                break;
            default:
                break;
        }
    }

    private void FacingSouth(char move) {
        switch (move) {
            case 'M':
                y -= 1;
                break;
            case 'L':
                charOrient = 'E';
                break;
            case 'R':
                charOrient = 'W';
                break;
            default:
                break;
        }
    }

    private void FacingNorth(char move) {
        case 'N': {
            switch (move) {
                case 'M':
                    y += 1;
                    break;
                case 'L':
                    charOrient = 'W';
                    break;
                case 'R':
                    charOrient = 'E';
                    break;
                default:
                    break;
            }
            return;
        }
    }
}