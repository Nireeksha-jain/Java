// interfaces
// pure abstraction method which strictly shows what is required
// classes has to be public, static and final
// does not allow non abstract methods

interface Animal{
    public void walk();
}

interface Herbivores{
    public void walk();
}

class Horse implements Animal,Herbivores{
    public void walk(){
        System.out.println("Horse can walk");
    }
    public void eat(){
        System.out.println("Horses can eat");
    }
}

public class Program11{
    public static void main (String args[]){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}