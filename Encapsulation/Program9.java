// //there are 4 types of modifiers:
// public,private,protected and default
// public: accessible to all classes, packages, subclasses
// protected: accesible to the same class and subclasses of diffrent packages
// private: accesible within class
// default: accesible to same class and package
//public: public static void main: compiler looks for classes that are public to complie
//if no access specfier is mentioned, default is considered
//private: cant be accessed, if needed, getters and setters to be used.

class Details{
    public String name;
    public String email;
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
        }
}

public class Program9{
    public static void main (String args[]){
        Details a1 = new Details();
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());

    }
}