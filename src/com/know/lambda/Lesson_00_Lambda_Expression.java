/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.know.lambda;

/**
 * Lambda Expressions are Anonymous Function,
 * That is function with
 *  - NO NAME
 *  - NO RETURN TYPE
 *  - NO MODIFIER
 *  - ADD ARROW SYMBOL
 * Lambda expression are introduced in java 8 to 
 * enable Functional Programming features in java.
 * Other Languages like Python, R, C , C++ 
 * already have Lambda Features.
 * 
 * If we have function 
 * 
 * public void test(){ System.out.println("Test Function in java 7");}
 * 
 * then in java 8 we can create using no name , no return type and no modifier
 * 
 * Remove Public , void and test
 * ()->{System.out.println("Test Function in java 8");}
 * 
 * we can remove braces in case of a single line
 * () -> System.out.println("Cheers to Java 8");
 * 
 * 
 * @author KnowGroup
 */
public class Lesson_00_Lambda_Expression {
   
    public void test(){
        System.out.println("Test function in java 7");
    }
    
    @FunctionalInterface
    interface Interf1{
     abstract void m1();    
    }
    
    interface Interf2{
     abstract void m2(Integer i,Integer j);    
    }
    
    interface Interf3{
     abstract Integer m3(Integer i,Integer j);    
    }
    
    public static void main(String arg[]){
        Interf1 if1 = () -> System.out.println("Cheers to Java 8");
        if1.m1();
        
        Interf2 if2 = (i,j) -> System.out.println("Adding :: "+i+"+"+j+" = "+(i+j));        
        if2.m2(10, 20);
        
        Interf3 if3 = (i,j) -> i*j;
        Integer m3_result = if3.m3(12,10);
        System.out.println("m3_result :: "+m3_result);
        
        
    }    
}
