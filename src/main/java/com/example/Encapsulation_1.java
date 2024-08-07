package com.example;

import com.example.Encap_2;

public class Encapsulation_1 {

    public static void main(String[] args) {
        
        //people often consider encapsulation as data hiding but
        //its not entirely true.Encapsulation refers to the bundling
        //of related data members and methods together.This can be used to
        //achieve data hiding.

        Encap_2 obj=new Encap_2();
        obj.setDate(10);
        System.out.println("the age is :"+obj.getData());


        //static keyword
        /* If we want to access class members without creating an instance 
         * of class, we need to declare the class members static.
         * Static varialles can be accessed by calling the class name .
         * There is not need to create an instance of the class for accessing and 
         * shared among all the class instances. 
         * static function can only access static members and methods,to access non static
         * methods we need to create an object
         */
        Encap_2.marks=100;
        System.out.println("marks obtained : "+Encap_2.marks);

        //static block is called once the class is created 
        //all static blocks are executed once then main method is executed.


    }

    static {
        System.out.println("static block is called");
    }
}
