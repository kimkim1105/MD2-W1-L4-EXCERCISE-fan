package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);
        Fan fan2 = new Fan();
//        fan2.setSpeed(fan2.medium);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.isOn();
        System.out.println(fan2);
    }
}
