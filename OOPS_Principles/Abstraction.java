package OOPS_Principles;

interface Vehicle {
    void move();
}

class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

class Bike implements Vehicle {

    @Override
    public void move() {
        System.out.println("The bike is moving.");
    }
}

public class Abstraction {
    
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();

        myCar.move();
        myBike.move();
    }
}
