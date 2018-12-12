/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.know.lambda;

import static com.know.util.Utility.log;

/**
 * Lambda Expressions are Anonymous / Nameless Function, That is function with -
 * NO NAME - NO RETURN TYPE - NO MODIFIER - ADD ARROW SYMBOL Lambda expression
 * are introduced in java 8 to enable Functional Programming features in java.
 * Other Languages like Python, R, C , C++ already have Lambda Features.
 *
 * If we have function
 *
 * public void test(){ System.out.println("Test Function in java 7");}
 *
 * then in java 8 we can create using no name , no return type and no modifier
 *
 * Remove Public , void and test ()->{System.out.println("Test Function in java
 * 8");}
 *
 * IF Body contains only single Statement then , we can remove braces () ->
 * System.out.println("Cheers to Java 8");
 *
 * Lambda expressions are invoked by using 
 * Functional Interface - An interface with only single abstract method and indicated
 * by using @FunctionalInterface
 * 
 * @author KnowGroup
 */
public class Lesson_00_Lambda_Expression {

    public void test() {
        System.out.println("Test function in java 7");
    }

    @FunctionalInterface
    interface Interf1 {

        abstract void m1();
    }

    interface Interf2 {

        abstract void m2(Integer i, Integer j);
    }

    interface Interf3 {

        abstract Integer m3(Integer i, Integer j);
    }

    interface Interf4 {

        abstract Integer m4(String s);
    }

    interface Interf5 {

        abstract Integer m5(Integer i, Integer j);
    }

    public static void main(String arg[]) {
        Interf1 if1 = () -> System.out.println("Cheers to Java 8");
        if1.m1();


        /*
            Type interface (Compiler can guess type in the context) 
            of i & j based on the type defined in Functional Interface
        
           Curley breaces are optional in case of single statment
         */
        Interf2 if2 = (i, j) -> System.out.println("Adding :: " + i + "+" + j + " = " + (i + j));
        if2.m2(10, 20);

        Interf3 if3 = (i, j) -> i * j;
        Integer m3_result = if3.m3(12, 10);
        System.out.println("m3_result :: " + m3_result);

        /*
            If single parameter then NO need to use parenthesis around parameters
         */
        Interf4 if4 = s -> s.length();
        log(" Length of string `Five` : " + if4.m4("Five"));
        
        /*
            In case multiple statement in body then we must use
            curley braces.
        */
        Interf5 if5 = (i,j) -> {
          Integer result = 0;          
          while(i>0 && j>0 && result <= 10){
              result += i*j;
          }
          return result;
        };        
        log(" Lastest increase to 10 : "+if5.m5(1,2));
    }
}
