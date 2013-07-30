package com.example.MarsRover;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 7/16/13
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Program {
    ArrayList<Rover> rovers = new ArrayList<Rover>();
    Plateau plateau;

    public static void main(String[] args) throws IOException {
        Program program = new Program();
        program.readFromFile();
    }

    public void readFromFile() throws IOException {
        BufferedReader reader = null;
        try {
            reader = openFile("/Users/Thoughtworker/Documents/MarsRover.txt");
            char[] nextLineArray = readLineConvertToCharArray(reader);
            Rover currentRover = new Rover(1, 2, new FacingNorth());
            while (!isEmpty(nextLineArray)) {
                if (Character.isDigit(nextLineArray[0])) {
                    currentRover = initializeRoverPosition(nextLineArray);
                }
                else {
                    currentRover.takeMoves(nextLineArray);
                    currentRover.printRoverPosition();
                }
                nextLineArray = readLineConvertToCharArray(reader);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        reader.close();
    }

    private Rover initializeRoverPosition(char[] nextLineArray) {
        Rover currentRover;
        currentRover = new Rover(Character.getNumericValue(nextLineArray[0]),
                Character.getNumericValue(nextLineArray[2]), charToFacing(nextLineArray[4]));
        return currentRover;
    }

    private char[] readLineConvertToCharArray(BufferedReader reader) throws IOException {
        String nextLine;
        char[] nextLineArray;
        nextLine = reader.readLine();
        nextLineArray = nextLine.toCharArray();
        return nextLineArray;
    }

    public Facing  charToFacing(char charFacing){
       if (charFacing == 'N')
           return new FacingNorth();
       else if (charFacing == 'S'){
           return new FacingSouth();
       }
       else if (charFacing == 'E'){
           return new FacingEast();
       }
        else
           return new FacingWest();
    }

    public boolean isEmpty(char[] array) {
        if (array.length == 0) {
            return true;
        } else {
            return false;
        }
    }

    private BufferedReader openFile(String filename) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        return reader;
    }
}
