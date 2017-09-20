package com.cl.util;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evel on 2017/9/15.
 */
public class StringUtil {
    public static List<Long> splitToList(String param,String split){

        List<Long> list = new ArrayList<Long>();
        if (StringUtils.isEmpty(param)){
            return list;
        }
        String[] strs = param.split(split);
        for (String str:strs){
            list.add(Long.parseLong(str));
        }

        return list;
    }
}
