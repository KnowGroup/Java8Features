/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.know.lambda;

/**
 * Functional Interface (FI) are java interface 
 * containing Single Abstract Method (SAM)
 * 
 *  -   Lambda expression are ALWAYS associated with Functional Interface
 *  -   NO Separate .class is generated for Lambda expression
 * 
 * @FunctionalInterface can be used to validate FI at compile time.
 * USE :
 *  - Calling Lambda Expression
 * 
 * - FI can have any number of default or static 
 * method but they must have SAM.
 * 
 * e.g. Runnable , Callable , Comparable 
 * 
 * @author KnowGroup
 */
public class Lesson_01_FuntionalInterface {
 
    
    @FunctionalInterface
    interface Intef1{
        abstract void m1();
    }
    
    /*
        java.util.function.* package contains all pre-defined Functional Interface
        Like Function<Input_Type,Return_Type>
    */
    static java.util.function.Function<Integer,Integer> square = n -> n*n;
    
    
    public static void main(String[] arg){
        log("30 Square :: "+square.apply(30));
        
        java.util.ArrayList<String> names = new java.util.ArrayList<String>();
        names.add("Raj");
        names.add("Jaz");
        names.add("Arya");
        names.add("Ajay");
        names.add("Zara");
        names.add("Madhu");
        
        log("Names :: "+names);
        
        /**
         *  Functional Interface java.util.Comparator
         *  can be defined using Lambda expression
         */
        java.util.Comparator<String> c = (s1,s2) -> s1.compareTo(s2);
        names.sort(c);
        
        log("Names Sorted :: "+names);
    }
    
    public static void log(String msg){
        System.out.println(msg);
    }
}