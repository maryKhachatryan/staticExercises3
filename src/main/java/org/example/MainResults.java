package org.example;

public class MainResults {
    public static void main(String[] args){
        int number = 5;

    int resultSquare = MathOperations.square(number);
    int resultCube = MathOperations.cube(number);

        System.out.println("Square of " + number + " is " + resultSquare);
        System.out.println("Cube of " + number + " is " + resultCube);

    }
}
