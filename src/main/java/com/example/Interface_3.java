package com.example;

public class Interface_3 {
    
    public static void main(String[] args) {
        // Animal obj=new Animal();  //just like abstract class we can't create object for interfaces
        Monkey obj=new Monkey();
        obj.eats();
        obj.drink();
        obj.sings();

        System.out.println(obj.legs);
    }
}


interface Animal {
    void eats();

    void drink();//this is for multiple inheritance
    
}

interface  Pet {

    void sings();
    void drink();//this is for multiple inheritance

    int legs=4;//variables in interfaces are public static final

    default void walk(){    //we can use default functions in interfaces
        System.out.println("Pet is waliking");
    }
    
}

class Monkey implements Animal,Pet{

    public void eats(){
        System.out.println("monkey is eating");
    }

    public void sings(){
        System.out.println("pet is singing");
    }

    public void drink(){
        //here we are defining only single drink function so no ambiguity
        System.out.println("monkey is drinking");
    }
}
