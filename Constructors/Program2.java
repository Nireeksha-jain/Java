package Constructors;
class Students{
    String name;
    Integer rollNo;
    String subject;
    String result;

    public void examResult(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.subject);
        System.out.println(this.result);
    }
    Students(){
        System.out.println("Constructor called");
    }

}

public class Program2{
    public static void main (String args[]){
        Students student = new Students();
        student.name="Nireeksha";
        student.rollNo= 10;
        student.subject= "Maths";
        student.result = "Pass";
        student.examResult();
    }
}

// //Here Students() refer to constructor
// Constructor should always have the same name as the class.
// properties of constructor:
// 1) created when initialising an object
// 2) does not have any return type
// 3) can be called only once

// Constructors are of 3 types:
// 1) Non parameterised
// 2) parameterised
// 3) Copy constructors

//By default, non-parameterised constructor is considered in java if no constructor is used and constructor will always execute first.

