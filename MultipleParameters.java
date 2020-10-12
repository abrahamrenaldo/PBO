package com.PBO;

public class MultipleParameters {
    static void myMethod(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        // write your code here
        myMethod("Indro",24);
        myMethod("Jono",10);
        myMethod("Bagus",20);
    }
}
