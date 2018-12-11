/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.know.lambda;

import static com.know.util.Utility.log;

/**
 * Lambda Expressions(LE) are NOT Anonymous Inner Class
 * Anonymous Inner Class (AIC) is MORE powerful than LE
 * in a sense AIC are more flexible and uses multiple abstract methods and othe
 * 
 * 
 * @author KnowGroup
 */
public class Lesson_03_Anonymous_Inner_Class_and_Lambda_Expressions {
 
    public static void main(String[] arg){
        Thread t = new Thread(){
            @Override
            public void run() {
                for(int i = 0 ; i<10;i++){
                    log("Child Thread");
                }
            }
        };
        
        t.run();
        
        for(int i = 0 ; i<10;i++){
            log("Parent Thread");
        }        
    }
}
