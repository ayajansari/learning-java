package com.example;

/* every class is directly or indirectly derived from object class.
 * if a class does not extend any other class then it is a direct child class of object class
 * and if extends another class then it is indirectly derived .Therefore the object class methods are available to all java classes.
 * methods in object class-getClass(),hashCode(),toString(),equals(),clone(),finalize(),notify(),etc
 */
class Car{

    String model;
    int year;

    Car(String s,int a){
        this.model=s;
        this.year=a;

    }

    public boolean equals(Object obj){
        Car that=(Car)obj;
        if(this.model== that.model && this.year==that.year){
            return true;
        }else{
            return false;
        }
    }
}
public class object_class_6 {
    
    public static void main(String[] args) {
        
        Car obj1=new Car("Honda",2002);
        Car obj2=new Car("Honda",2002);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1.equals(obj2));//false before overriding equals function
        System.out.println(obj1.equals(obj2));//to check object we have to override the equals();


    }
}
