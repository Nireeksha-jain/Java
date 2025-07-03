class Car{
    String name;
    int age;

    public void carInfo(String name){
        System.out.println(name);
    }

    public void carInfo(int age){
        System.out.println(age);
    }

    public void carInfo(String name, int type){
        System.out.println(name+ ""+age);
    }

}
public class Program5 {
    public static void main (String args[]){
        Car car = new Car();
        car.carInfo(10);
    }

    
}


//Poly-many, morphism- forms
//it has 2 types:
//1) Method overloading - compile time polymorphism
//2) Method overriding

// Method overloading is when in a class we have several same functions with
// 1)different parameters,
// 2)different return types
// 3) different number of arguments
// we get errors in compile time itself