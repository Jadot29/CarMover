package com.example.MarsRover;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/17/13
 * Time: 9:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class PlateauTest{
    @Test
    public void shouldSetTheRoverCoordinatesBasedOnTopRight(){
        Plateau  marsRover = new Plateau(5,5);
        assertThat(marsRover.bottomLeftX, is(0));
        assertThat(marsRover.bottomLeftY, is(0));
        assertThat(marsRover.bottomRightY, is(0));
        assertThat(marsRover.bottomRightX, is(5));
        assertThat(marsRover.topLeftX, is(0));
        assertThat(marsRover.topLeftY, is(5));
        assertThat(marsRover.topRightX, is(5));
        assertThat(marsRover.topRightY, is(5));
    }
}
