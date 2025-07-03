// // Classes are like the blueprint of the object
// whereas objects are real time entities
// Ex: when we see Maruti 800, the final product is the object and the blueprint to make it is the class.

// Let us take example of a pen.
class Pen{
    String color;
    String type;
   
     public void penColor(){
        System.out.println(this.color);
     }

     public void penType(){
        System.out.println(this.type);
     }
}

public class Program1{ //main class

    public static void main (String args[]){
    Pen pen1 = new Pen();
    pen1.color="black";
    pen1.type="gel";
    pen1.penColor();
    pen1.penType();

    }
}

//Here in Class Pen, the blueprint is provided of what user expects and the functions for same tp perform operation. 
//In main class, user will just create an object, provide inputs, and call the functiom