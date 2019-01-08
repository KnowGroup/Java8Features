package com.know.interfaces;

/**
 * General utility method can be implemented inside Interface using static Keyword.
 * This are called static method(s) inside Interface
 * they serve the purpose of non-instance utility implementations.
 * 
 * static method(s) can ONLY be accessed by InterfaceName.staticMethodName();
 * 
 * @author KnowGroup
 */
interface Interf_Lesson_04{
     static double m1(int i){
         return (double)i;
     }
 }
 
public class Lesson_04_Static_Method_in_Interface implements Interf_Lesson_04{

    public static void main(String[] args) {
        double result = Interf_Lesson_04.m1(9012);
        
        // Not Allowed : Compile time error
        // new Lesson_04_Static_Method_in_Interface().m1(99213); 
        // Lesson_04_Static_Method_in_Interface.m1(8888);
    }
}