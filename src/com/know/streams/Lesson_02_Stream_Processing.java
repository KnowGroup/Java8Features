package com.know.streams;

import com.know.util.DataUtil;
import static com.know.util.DataUtil.*;
import static com.know.util.Utility.*;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author KnowGroup
 */
public class Lesson_02_Stream_Processing {

    public static void main(String[] arg){
       
        /*
        collect | element to a give Collector
         */
        //log(otp());
        Set<Integer> collect = DataUtil.fibbinacos().stream().collect(Collectors.toSet());
       
    }
}
