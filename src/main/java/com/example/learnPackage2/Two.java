package com.example.learnPackage2;
import com.example.learnPackage1.Second;
public class Two extends Second{
    
    public static void main(String[] args) {
        //cast-4 different package subclass
        Two obj11=new Two();
        System.out.println(obj11.sum);
        System.out.println(obj11.total);
        // System.out.println(obj11.avg); //cannot access private var
    }
}
