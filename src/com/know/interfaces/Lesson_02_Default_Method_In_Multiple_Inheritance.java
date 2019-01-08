package com.know.interfaces;

/**
 * default methods in interface create diamond problem 
 * when a class implements multiple interface with default methods of same name.
 * 
 * To overcome this issue overriding feature can be used.
 * 
 * @author KnowGroup
 */
interface Intref1 {
        default int m1(){             
            System.out.println("I am m1 , Concrete method of Intref");
            return 999;
        }
        void m2();  // Abstract method 
        default void m3(){
            System.out.println("I am m3 , Concrete method of Intref");
        }
    }
    
    interface Intref2{
        default int m1(){             
            System.out.println("I am m1 , Concrete method of Intref");
            return 999;
        }
        void m2();  // Abstract method 
        default void m3(){
            System.out.println("I am m3 , Concrete method of Intref");
        }
    }
    
    class Test implements Intref1,Intref2{
        java.util.function.Consumer<Object> log = obj -> System.out.println(obj.toString());
        
        @Override
        public int m1() {
            log.accept("m1 implementation in Test class");
            return 100;
        }
        
        @Override
        public void m2() {
            log.accept("m2 default implementation in Test");
        }

        @Override
        public void m3() {
            Intref1.super.m3(); 
            Intref2.super.m3(); //Call implementation from Intref2
        }
    }
public class Lesson_02_Default_Method_In_Multiple_Inheritance {
    public static void main(String arg[]){
      Test t = new Test();
      t.m1();
      t.m2();
      t.m3();
    }    
}