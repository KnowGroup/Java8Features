package com.know.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KnowGroup
 */
public class DataUtil {

    public static List<Integer> fibbinacos(){
        List<Integer> result = new ArrayList<>();
            result.add(1);
            result.add(2);
            result.add(3);
            result.add(5);
            result.add(8);
            result.add(13);
            result.add(21);
            result.add(34);
            result.add(55);
            result.add(89);
            result.add(134);
        return result;
    }
    
    public static String otp(){
        final StringBuilder o = new StringBuilder();
        for(int i = 0 ; i < 6 ;i++){
            o.append((int)(Math.random()*10));
        }
        return o.toString();
    }
}
