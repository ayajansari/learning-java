package com.example;

//anonymous classes usually extend subclasses or implement interfaces

public class Anonymous_Class_4 {
    
    public static void main(String[] args) {
        //way-1
        // outerClass obj=new outerClass();//obj for outer classs
        outerClass obj=new outerClass(){    //obj is object for anonyous class { }; this is anonymous class with no name
            //class body

            public void sing(){
                System.out.println("signing");
            }
        };
        obj.sing();



        //way-2
        outerClass1 obj1=new outerClass1() {
            
            public void func(){
                System.out.println("functioning");
            }
        };
        obj1.func();

        //functional interface -> interface having only one function
        functionalInterface obj3=(int steps)->{
           System.out.println(steps);
            return steps;
        };

        obj3.interfaceMethod(12);


    }
}

class outerClass{

    void sing() { }
}

interface  outerClass1 {

    void func();
    
}

interface functionalInterface {

    int interfaceMethod(int steps);
    
}