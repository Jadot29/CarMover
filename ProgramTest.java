package com.example.MarsRover;

import com.sun.corba.se.impl.orb.ParserTable;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
* Created with IntelliJ IDEA.
* User: Thoughtworker
* Date: 7/16/13
* Time: 4:58 PM
* To change this template use File | Settings | File Templates.
*/
public class ProgramTest {
    @Test
    public void shouldTakeInputFromTextFile() throws IOException {
      Program program = new Program();
         program.readFromFile();
        assertEquals(program.plateau.topRightX, '5');
        assertEquals(program.rovers.get(0).getX() , '0');
    }

}