package com.know.lambda;

import static com.know.util.Utility.log;

/**
 * Anonymous Inner Class (AIC) is Name Less Inner Class
 * Lambda Expressions(LE) are NOT AIC
 * 
 * LE != AIC
 * 
 * @author KnowGroup
 */
public class Lesson_05_Anonymous_Inner_Class_and_Lambda_Expressions_Part_1 {
 
    public static void main(String[] arg){
        // EXAMPLE 1
        
        Thread t = new Thread(){
            // Write a class with NO name
            // This is Anonymous Inner Class
            @Override
            public void run() {
                for(int i = 0 ; i<10;i++){
                    log("Child Thread");
                }
            }
        };
        
        t.start();
        
        for(int i = 0 ; i<10;i++){
            log("Parent Thread");
        }  
        
        
        // Anonymous Inner class could be replaced with Inner Class
        // Since Runnable is Functional Interface then we can define it using 
        // Lambda Expression
        
        Runnable r = ()->{
            for(int i=0;i<10;i++){
                log("Lambda Child Thread ");
            }            
        };
        Thread t1 = new Thread(r);        
        t1.start();       
        
        Thread t2 = new Thread(()->{
            for(int i=0;i<10;i++)
                log("T2 Lambda child Thread");
        });
        t2.start();
        
        // EXAMPLE 2
        /*
        
            Anonymous Inner class(AIC) can have following types ::
        
            1. AIC that extends Conceret Class
            2. AIC that extends Abstract Class
            3. AIC that extends Interface with any number of methods
            4. AIC that extends Interface with single abstract method (i.e. Functional Interface(FI))
        
            Only, 4th AIC can be replaced with Lambda Expression, since it is the only one with FI.
        */
        
        // Concrete Class
        class A{
            protected void m(){
                log("A m()");
            }
        }
        // Type1 AIC
        A a = new A(){
        };
        
        // Abstract Class
        abstract class B{
            abstract void m();
        }
        // Type2 AIC
        B b = new B(){
            void m(){
                log("B m()");
            }
        };
        
        // Type3 AIC
        C c = new C(){
            public void m2() {}
            public void m3() {}
            public void m1() {}
        };

        // Type4 AIC
        D d = new D() {
            public void m1() {}
        };
        
        // Type4 AIC can only be replaced with Lambda Expressions
        D d_l = ()->{};
        
    }
    // NON-Functional Interface
        interface C{
          void m1();
          void m2();
          void m3();
        }
    // Functional Interface
        @FunctionalInterface
        interface D{
            void m1();
        }
}
