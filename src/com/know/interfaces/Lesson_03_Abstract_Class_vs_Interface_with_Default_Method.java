package com.know.interfaces;

/**
 * It is important to understand if we can add concrete methods in interface using 
 * default keyword , then will it be same as Abstract Class ?
 * Answer is NO
 * Following are difference between Abstract Class and Interface with default method
 * 
 * 1. Inside Interface every variable is always public, static and final; But
 *  Abstract class can have instance variable also.
 * 2. Interface does have a state , while Abstract classes maintains state of Object
 *  using instance variables.
 * 3. Since no instance or state if maintained , constructor declaration is not supported 
 *  inside Interface but Abstract allows it.
 * 4. Concrete Methods in Interface are only dummy implementations 
 * 5. Inside Interface we can't override Object class methods but it is allowed in Abstract class.
 * 6. Lambda Expressions can be refer by interface with default method but not by Abstract class.
 * 7. Instance and Static blocks are not allowed inside Interface but can be created in Abstract class.
 * 
 * @author KnowGroup
 */
interface Intref_Lesson_03 {
        
        // private Integer i =0;   1. Not allowed
        // Intref_Lesson_03(){}    3. Not allowed

        /**
          5. Not Allowed
          
           Override
           public String toString(){}
         **/ 
    
            default void m1(){
               Runnable  r = ()->System.out.println("Lambda ");
               r.run();
            }
        }



    abstract class Test_Lesson_03 {
        private Integer i = 0;
        Test_Lesson_03(){}

        @Override
        public String toString() {
            return "Object Method overriden";
        }

        abstract void abs();
        protected void m1(){
            Runnable r = () -> System.out.println("Lambda in Abstract class");
            r.run();                 
        }
    }
public class Lesson_03_Abstract_Class_vs_Interface_with_Default_Method {
    public static void main(String arg[]){
    }    
}