// Abstraction: showing only required details to user.
// in Abstraction we have 2 types:
// 1) abstract methods
// 2)interfaces
// abstract uses abstract keyword
// abstract cant be  initiated
// we can have constructors and static methods in abstract methods
// abstract can be seen in inheritance
// it can have bot abstract and non abstract methods

abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animals can eat");
    }
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse can walk");
    }
}

public class Program10{
    public static void main (String args[]){
        Horse horse = new Horse();
        horse.eat();
        horse.walk();
    }
}