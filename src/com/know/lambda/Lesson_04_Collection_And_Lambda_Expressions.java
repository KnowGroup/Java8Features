package com.know.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * Any where there is Functional Interface we can use 
 * Lambda Expression. 
 * Since Java Collection framework classes support 
 * comparator functional interface we can optimize code 
 * with Lambda expressions.
 * 
 * @author KnowGroup
 */
public class Lesson_04_Collection_And_Lambda_Expressions {

    public static void main(String[] arg){
        
        Consumer<Object> log = o -> System.out.println(o.toString());
        
        /*
            Comparator is a Functional Interface since it 
            contains only single abstract method 
                int compare(T o1, T o2);
            Thus can hold Lambda Expressions
        */
        // EXAMPLE 1
        Comparator<String> c = (obj1,obj2) -> obj1.compareTo(obj2);
        List<String> names = Arrays.asList("Raj","Zara","Aron","Mirza","Chao","Dravid");
        
        log.accept(names);
        names.sort(c);
        log.accept(names);
        
        // EXAMPLE 2
        Comparator<Integer> score_comparator = (s1,s2) -> s1 < s2 ? -1 : s1 > s2 ? 1 : 0 ;
        List<Integer> scores = Arrays.asList(90,12,80,-10,-20,30,40,100,150);
        
        scores.sort(score_comparator);
        log.accept(scores);
        
        
        // EXAMPLE 3
        Integer id = 1000;
        List<Student> students = new ArrayList<>();
            students.add(new Student(++id, "Arya", 939.500));
            students.add(new Student(++id, "Zubia", 739.500));
            students.add(new Student(++id, "Mini", 839.500));
            students.add(new Student(++id, "Chini", 839.300));
            students.add(new Student(++id, "Bunny", 530.800));
            students.add(new Student(++id, "Danny", 838.900));
            students.add(new Student(++id, "Ranny", 455.700));
            students.add(new Student(++id, "Arya M", 839.100));
            
            
        log.accept(students);
        
        // Sort by name
        Collections.sort(students,(s1,s2)->s1.name.compareTo(s2.name));
        log.accept(students);
        
        // Sort by score
        Collections.sort(students,(s1,s2)->s1.score < s2.score ? 1 : s1.score > s2.score ? -1 : 0);
        log.accept(students);
        
        
        // EXAMPLE 4
        Set<Integer> random_nums = new TreeSet<>();
            // Math.random() return a random value between 0 till 1
            random_nums.add((int)(Math.random()*100));
            random_nums.add((int)(Math.random()*100));
            random_nums.add((int)(Math.random()*100));
            random_nums.add((int)(Math.random()*100));
            random_nums.add((int)(Math.random()*100));
            random_nums.add((int)(Math.random()*100));
            random_nums.add((int)(Math.random()*100));
        
        // Natural Assending Order
        log.accept(random_nums);
        
        Set<Integer> desc_random_nums 
                = new TreeSet<>((i1,i2)->i1 < i2 ? 1 : i1 > i2 ? -1 : 0);
        desc_random_nums.addAll(random_nums);
        
        log.accept(desc_random_nums);      
        
    }
}
class Student{
        Integer id;
        String name;
        Double score;

        public Student(Integer id, String name, Double score) {
            this.id = id;
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + ", score=" + score + '}';
        }        
    }