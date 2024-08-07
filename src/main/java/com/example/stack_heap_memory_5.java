package com.example;

public class stack_heap_memory_5 {
    
    public static void main(String[] args) {
        int i=1;//i will be stored in stack mem
        stack_heap_memory_5 obj=new stack_heap_memory_5();  //obj refernce stored in stack mem and memory allocated in heap
        obj.foo(4);

        String s1="hello";
        String s3="hello";
        if(s1==s3){
            System.out.println("yes");
        }
    }
    public void foo(int a){
        System.out.println(a);//a will be stored in stack mem
    }
}
