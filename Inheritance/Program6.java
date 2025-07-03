//Single Inheritance
class Device{

    public void deviceName( String name){
        System.out.println(name);
    }
    }

class DeviceType extends Device{

    public void showType(String type){
        System.out.println(type);
    }

}

public class Program6 {
    public static void main(String[] args) {
        DeviceType d1 = new DeviceType();
        d1.deviceName("iPhone");
        d1.showType("Apple");
        
    }
   
}

//Inheritance
//If one class wants the properties of another class, we call it Inheritance.
// in inheritance there are 5 types
// 1)single inheritance : base to child
// 2)multi-level inheritance : base to child1, child1 to child2
// 3)hierachial inheritance :base to child 1, base to child2
// 4) multiple inheritance: not in java, but can be implemented in interfaces
// 5) hybrid inheritance: which has mixture of all other inheritances
