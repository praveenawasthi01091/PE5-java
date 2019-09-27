package com.stackroute.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q5 {
    public static void main(String[] args)
    {
        Map<String,String>map=new LinkedHashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        map=changeValues(map);
        for (Map.Entry entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
    public static Map<String, String>  changeValues(Map<String,String >map)
    {
        for (Map.Entry entry : map.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        if(map.containsKey("val1"))
        {
            String tempString=map.get("val1");
           // System.out.println(tempString);
            if(tempString.isEmpty())
            {
                System.out.println("Empty String");
            }
            else
                {
                map.put("val1", "");
                map.put("val2", tempString);
            }
        }
        else
        {
            System.out.println("VAl1 no found");
        }

        return map;
    }
}
