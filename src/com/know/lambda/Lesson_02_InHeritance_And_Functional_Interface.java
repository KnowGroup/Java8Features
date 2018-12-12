/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.know.lambda;

/**
 * Inheritance and Functional interface  
 * 
 * @author manbhakr
 */
public class Lesson_02_InHeritance_And_Functional_Interface {
 
    /*
      1st CASE
        IF 
            Parent is Functional Interface  
        THEN
            Child is also Functional Interface        
    */
    
    @FunctionalInterface
    interface A1{
        public void m();
    }
    
    @FunctionalInterface
    interface B1 extends A1{
        
    }
    
    
    /*
      2nd CASE
        IF
            Child contains Single Abstract Method 
            with signature sames as in Parent
        THEN
            Child still be a Functional Interface
    */    
    @FunctionalInterface
    interface A2 {
        public void m1();
    }
    
    @FunctionalInterface
    interface B2 extends A2 {
        public void m1();
    }
    
    /*
      3rd CASE
            IF
                Parent interface if a functional interface 
                and child contains another abstract method
            THEN
                Child interface CAN NOT be functional interface        
    */
    @FunctionalInterface
    interface A3 {
        public void m3();
    }
    //NOT ALLOWED becuase Child B3 has Two abstract method
    //@FunctionalInterface
    interface B3 extends A3 {
        public void m4();
    }
    
    
    public static void main(String[] arg){}
    
}
