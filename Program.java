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
        ArrayList<Rover> rovers = program.readFromFile();
        for (Rover rover : rovers) {
            System.out.println(rover.getX() + " " + rover.getY() + " " + rover.getOrientation());
        }
    }

    public ArrayList<Rover> readFromFile() throws IOException{
        Plateau plateau = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/Thoughtworker/Documents/MarsRover.txt"));
            boolean done = false;
            String nextLine = reader.readLine();
            char[] nextLineArray = nextLine.toCharArray();
            plateau = new Plateau(nextLineArray[1], nextLineArray[3]);
            Rover currentRover = new Rover();
            while (!done) {
                nextLine = reader.readLine();
                nextLineArray = nextLine.toCharArray();
                if (nextLineArray.length != 0) {
                    if (Character.isDigit(nextLineArray[0])) {
                        currentRover = new Rover(Character.getNumericValue(nextLineArray[0]),
                                Character.getNumericValue(nextLineArray[2]), nextLineArray[4]);
                    } else if (Character.isLetter(nextLineArray[0])) {
                        currentRover.takeMoves(nextLineArray);
                        rovers.add(currentRover);
                    }
                } else {
                    done = true;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }

        reader.close();
        return rovers;
    }
}
