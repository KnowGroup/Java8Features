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
public class Lesson_06_Method_Variables_and_Lambda_Expressions {

    public static void main(String[] arg){
        Consumer<Object> log = o -> System.out.println(o.toString());      
        /*
            Lambda Expressions can access both 
                1. Class instance variable(s)
            and 
                2. Method Local variable(s)
        
            but if Only Method Local Variable(s) would become FINAL and no further
            updates would be allowed.        
        */
        
        // Variables declared in Lambda Expressions are 
        // LOCAL Variables NOT INSTANCE Variables
        
        class Test {
            int x = 888; // Instance variable
            public void m2(){
                int y = 999; // Method local variable FINAL not need to use final keyword
                final int y_y = 9999;
                
                Intref i = () -> {
                    int z = 555; // Local Lambda Expression
                    log.accept("Lambda x "+x);
                    log.accept("Lambda y "+y);
                    log.accept("Lambda z "+z);
                    
                    x = 8880;
                    //y = 9990; Compile time ERROR
                    //y_y = 99990; Compile time error for explicit final 
                    z = 5550;
                    
                    log.accept("Updated Lambda x "+x);
                    log.accept("Updated Lambda y "+y); 
                    log.accept("Updated Lambda z "+z);
                };
                i.m();
            }
        }
        
        Test t = new Test();
        t.m2();
    }
    @FunctionalInterface
    interface Intref{
        public void m();
    }
}
