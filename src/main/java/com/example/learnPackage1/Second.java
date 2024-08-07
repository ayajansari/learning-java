package com.example.learnPackage1;

import com.example.learnPackage2.One;

public class Second{
    
    
    public int sum=0;
    private int avg=10;
    protected int total=12;
    protected int fun=123;

    public static void main(String[] args) {

        //cast-5 different packages non-subclass
        One obj6=new One();
        System.out.println(obj6.sum1);//public var is accesible in different package subclass
        // System.out.println(obj6.total1);//protected var is not accss. in different package subclass
        // System.out.println(obj6.avg1)  //private is not accessible 
    }
}
