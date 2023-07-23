import java.util.Scanner;

abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    @Override
    void write(){
        System.out.println("Writing...");
    }
    @Override
    void refill() {
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing nib");
    }
}

class Monkey{
    void Jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class human extends Monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{

    @Override
    void ring() {
        System.out.println("ringing...");
    }
    @Override
    void lift() {
        System.out.println("lifting...");
    }
    @Override
    void disconnect() {
        System.out.println("disconnecting...");
    }
}

interface TVRemote {
    void turnOn();
    void turnOff();
}

interface SmartTVRemote extends TVRemote {
    void speechRecognition();
}

class TV implements TVRemote{
    @Override
    public void turnOn() {
        System.out.println("Turning on...");
    }
    @Override
    public void turnOff() {
        System.out.println("Turning off...");
    }
}

public class Java_Chapter_11_Practice_Set {
    public static void main(String[] args) {
        Telephone Phone = new SmartTelephone(); // --> can only implement methods of telephone
        BasicAnimal Neanderthal = new human(); // --> can only implement methods present in BasicAnimal
    }
}
