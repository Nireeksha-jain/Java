class Students{
    String name;
    int rollNo;
    String subject;
    String result;

    public void examResult(){
        System.out.println(this.name);
        System.out.println(this.rollNo);
        System.out.println(this.subject);
        System.out.println(this.result);
    }
    //Parameterised Constructor
    Students(String name, int rollNo, String subject, String result){
        this.name = name;
        this.rollNo = rollNo;
        this.subject = subject;
        this.result = result;
        
    }

}

public class Program3{
    public static void main (String args[]){
        Students student = new Students("Momo",12,"Maths","Pass");
        student.examResult();
    }
}

// Parameterised Constructors:
// instead of typing individually student.name, student.rollNo, we are taking it as parameters.
// In the class, we are calling the constructor, referencing the property with this keyword and assigning it with the main class value.
// in main class, we have to just pass the value in the parameter
