package com.know.streams;

import com.know.util.DataUtil;
import com.know.util.Utility;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Steam configuration can be done by filter and map operation
 * @author KnowGroup
 */
public class Lesson_01_Stream_Configuration_filter_map {
 
    public static void main(String[] arg){
        /*
            filter | elements based on a given predicate
        */
        List<Integer> collect = 
                DataUtil.fibbinacos().stream().filter(n->n%2==0).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        
        Utility.log("============");
        
        /*
            map | elements to another form defined in a function
         */
        List<Integer> mapped = 
                DataUtil.fibbinacos().stream().map(n->n*n).collect(Collectors.toList());
        mapped.stream().forEach(System.out::println);
    }
}
