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

    //Copy Constructor
    Students(Students s2){
        this.name = s2.name;
        this.rollNo = s2.rollNo;
        this.subject = s2.subject;
        this.result = s2.result;
        
    }

    Students(){

    }

}

public class Program4{
    public static void main (String args[]){
        Students student = new Students();
        student.name = "Momo";
        student.rollNo = 12;
        student.subject = "English";
        student.result = "Pass";
        Students s2 = new Students(student);

        s2.examResult();
    }
}

// Copy Constructors:
//Copying one object to another

//java doesnt have destructors as it has garbage collection by default which recognises if object is taking unnecessary memory, it will delete it.