package com.know.lambda;

/**
 * 
 * Examples of implementation of various Functional Interface 
 * using Lambda Expressions
 * 
 * @author KnowGroup
 */
public class Lesson_03_Implement_Functional_Interface_Using_Lambda_Expressions {

    @FunctionalInterface
    interface LogI {
        public void log(String msg);
    }
    
    @FunctionalInterface
    interface AddI {
        public int add(int v1,int v2);
    }
    
    @FunctionalInterface
    interface AvrgI {
        public double avg(int... values);
    }
    
    public static void main(String[] arg){
        //EXAMPLE 1
        LogI l = msg -> System.out.println(msg);
        l.log("Log Message");
        
        //EXAMPLE 2
        AddI a = (v1,v2) -> v1+v2;
        int result = a.add(40, -50);
        l.log("SUM 40 - 50 = "+result);
        
        //EXAMPLE 3
        AvrgI avg =  values -> {
          double sum = 0;
          for(int v : values){
              sum += v;
          }
          return sum/values.length;
        };
        double avg_value = avg.avg(10,20,-10,90,89);
        l.log("Average Score = "+avg_value);
        l.log("Average Score 2 = "+avg.avg(1,2,3,4,5,6,7,8,9,10));
        
        //EXAMPLE 4
        Runnable r = () -> l.log("Child Thread");
        Thread child_thread = new Thread(r);
        child_thread.start();
        
        //EXAMPLE 5
        Thread child = new Thread(()->{
           for(int i = 0;i<10;i++){
               l.log("Child "+i);
           } 
        });
        child.start();
        for(int i = 0;i<10;i++){
            l.log("Main "+i);
        }        
    }
}
