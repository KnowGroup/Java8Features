package com.know.interfaces;

/**
 * Concrete methods can be implemented in Interface since Java 1.8
 * by using default key word
 * 
 * 
 * @author KnowGroup
 */
public class Lesson_01_Interface_Default_Method {

    interface Intref {
        // Conrete method created using default keyword, which is not same as 
        // default package of class
        default int m1(){             
            System.out.println("I am m1 , Concrete method of Intref");
            return 999;
        }
        void m2();  // Abstract method 
        
        default void m3(){
            System.out.println("I am m3 , Concrete method of Intref");
        }
    }
    
    public static void main(String arg[]){
      Intref i1 = () -> System.out.println("I am m2 , Abstract Method of Intref");
      i1.m1();
      i1.m2();
      i1.m3();
      
      Intref i2 = new Intref(){
          public void m2() {
              System.out.println("Inner class m2 implementation");
          }

          @Override
          public void m3() {
              System.out.println("Inner class overring default interface m3");
          }
      };
      
      i2.m1();
      i2.m2();
      i2.m3();
    }
}
