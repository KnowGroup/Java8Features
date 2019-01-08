package com.know.interfaces;

/**
 *
 * Since scope of interface static method(s) is only in Interface they can not
 * be overridden by any subclass.
 * 
 * Thus, a method in implementor class with declaration same as static method in
 * Interface would be valid.
 * 
 * @author KnowGroup
 */
interface interf_05{
        static double m1(int n){
            return (double) n;
        }
    }
    
class Test_05 implements interf_05{
    //  Not Allowed
    //  @Override 
    static double m1(int n){
        return (double) n;
    }
}
public class Lesson_05_overriding_interface_with_static_method {
    
}
