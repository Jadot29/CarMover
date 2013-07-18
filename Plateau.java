package com.example.MarsRover;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/17/13
 * Time: 8:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class Plateau {
    int topRightX, topRightY, bottomLeftX, bottomLeftY, bottomRightX, bottomRightY, topLeftX, topLeftY;

    public Plateau(int topRightX,int topRightY){
        this.topRightX = topRightX; this.topRightY = topRightY;
        bottomRightX = topRightX; bottomRightY = 0;
        topLeftX = 0 ; topLeftY = topRightY;
        bottomLeftX = 0; bottomLeftY = 0 ;
    }
}
