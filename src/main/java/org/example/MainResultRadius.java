package org.example;
import static  org.example.Circle.calculateArea;

public class MainResultRadius {
    public static void main(String[] args){
        double radius = 7.0;

        double area = calculateArea(radius);
        System.out.println("Area of the circle with radius " + radius + " is " + area);
    }
}
