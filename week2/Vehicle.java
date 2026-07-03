public class Vehicle {
    // Base class: Vehicle → Subclasses: Car, Bike (override methods).

    public void move(){
        System.out.println("vehicle are moving");
    }
}

class Car extends Vehicle{
    public void move(){
        System.out.println("Car moving");
    }
}

class Bike extends Vehicle{
    public void move(){
        System.out.println("Bike moving");
    }
}

class Driver{
    public static void main(String[] args) {
       Vehicle v1=new Vehicle();
       Vehicle v2=new Car();
       Vehicle v3=new Bike();

       v1.move();
       v2.move();
       v3.move();
    }
}
