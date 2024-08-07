package com.example.learnPackage1;

public class First{

    public int a=10;
    private int b=20;
    protected int c=20;

    public static void main(String[] args){
        
  
        //case-1  same class
        First obj=new First();
        System.out.println(obj.a);//public var is accesible in same class
        System.out.println(obj.b);//private var is accss. in same class
        System.out.println(obj.c);//protected var is accss. in same class
     
        //case-3  same package non-subclass
        Second obj20=new Second();
        System.out.println(obj20.sum);//public var is accesible in same package non-subclass
        System.out.println(obj20.total);//protected var is accss. in same package non-subclass
        System.out.println(obj20.fun);
        // System.out.println(obj1.avg);//private var is not accessible

        //case-2 access modifiers in same package subclass. this is available in third.java
        
    
    
    
    }
}
