package com.example.MarsRover;

import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static sun.nio.cs.Surrogate.is;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/17/13
 * Time: 9:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class RoverTest {
    Rover rover  = new Rover();
    @Test
    public void shouldSetRoverInitialOrientation(){
        assertEquals(rover.getOrientation(), 'N');
    }

    @Test
    public void shouldSetRoverInitPosition(){
        assertEquals(rover.getX(),1);
        assertEquals(rover.getY(),2);
    }

    @Test
    public void shouldTakeMoveInputAndUpdatePosition(){
        String move  = "LM";
        rover.takeMoves(move.toCharArray());
        assertEquals(rover.getX(), 0);
        assertEquals(rover.getOrientation(),'W');
    }

}
