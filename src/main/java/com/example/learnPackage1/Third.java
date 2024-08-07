package com.example.learnPackage1;

public class Third extends Second{

    public static void main(String[] args){

        //case-2 access modifiers in same package subclass.
        Second obj4=new Second();
        System.out.println(obj4.sum);//public var is accesible in same package subclass
        System.out.println(obj4.total);//protected var is accss. in same package subclass
        System.out.println(obj4.fun);
        // System.out.println(obj4.avg)  //private is not accessible 
    }
}