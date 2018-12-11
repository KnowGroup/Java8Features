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
 
    @FunctionalInterface
    interface A {
        public void m1();
    }
    
    @FunctionalInterface
    interface B extends A {
        public void m1();
    }
    
    public static void main(String[] arg){
        B b = () -> System.out.println("I am B");
        A a = () -> System.out.println("I am A");
        A a_obj = b;
        
        b.m1();
        a.m1();
        a_obj.m1();
    }
}
