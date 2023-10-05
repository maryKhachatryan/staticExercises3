package org.example;

public class StaticBlockExample {

    static{
        System.out.println("Static block is invoked" );
    }
    public static void main(String[] args){
        StaticBlockExample statEx = new StaticBlockExample();
        System.out.println("msg");
    }
}
