package org.example;
public class StaticExample {
    private static int counter = 0;

    public StaticExample(){

        counter++;
    }
    public static int getCounter() {

        return counter;
    }
    public static void main(String[] args){
        StaticExample object1 = new StaticExample();
        StaticExample object2 = new StaticExample();
        StaticExample object3 = new StaticExample();

        System.out.println("Counter: " + StaticExample.getCounter());
    }
}
