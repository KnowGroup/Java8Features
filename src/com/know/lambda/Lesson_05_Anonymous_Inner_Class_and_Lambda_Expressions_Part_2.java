package com.know.lambda;

import java.util.function.Consumer;

/**
 * Anonymous Inner Class (AIC) is Name Less Inner Class
 * Lambda Expressions(LE) are NOT AIC
 * 
 * LE != AIC
 * 
 * @author KnowGroup
 */
public class Lesson_05_Anonymous_Inner_Class_and_Lambda_Expressions_Part_2 {

    public static void main(String[] arg){
        Consumer<Object> log = o -> System.out.println(o.toString());      
        /*
            Anonymous Inner Class can declare local variables just like any class
            and this.local_variable would refer to Latest inner class variable.
        */
        
        class A {
            int x = 888;
            public void m(){
                log.accept(this.x);
            }
        }
        
        A a = new A(){
            int x = 999;
            public void m(){
                log.accept(this.x);//this would refer to 999
            }
           };
        a.m();
        
        
        
        // Variables declared in Lambda Expressions are 
        // LOCAL Variables NOT INSTANCE Variables
        
        class Test {
            int x = 888;
            public void m2(){
                Intref i = () -> {
                    int x = 999; // This is LOCAL variable to m1() method of Functional Interface
                    log.accept("Lambda x "+this.x);// It is instance variable 888
                };
                i.m();
            }
        }
        
        Test t = new Test();
        t.m2();
    }
    interface Intref{
        public void m();
    }
}
