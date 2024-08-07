package com.example;

//to achieve abstraction we can use abstract class,interfaces,access modifiers
public class Abstract_Class_2 {
    
    public static void main(String[] args) {
        // Vehicle obj=new Vehicle();  //we cant instantiate abstract class because object's are not possible
        //we cant create object for abstract class but we can create subclasses
        Car obj=new Car();
        obj.accelerate();
        obj.breakes(3);
    }
}

abstract class Vehicle{
    abstract void accelerate();
    abstract int breakes(int wheels);
    // if abstract methods are there then we need to provide the method body in subclasses.
    
    void honks(){
        System.out.println("car is honks");
    }
}

class Car extends Vehicle{

    void accelerate(){
        System.out.println("car is accelerating");
    }
    int breakes(int wheels){
        System.out.println("breakes are applied");
        return wheels;
    }
}