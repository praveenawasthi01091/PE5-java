package com.stackroute.main;


import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
         String inputCharArray[] = {"a","b","c","d","a","c","c"};
        Map<String,Integer> mapWords= new HashMap<>();
        for(int i=0;i<inputCharArray.length;i++)
        {
            if (mapWords.containsKey(inputCharArray[i]))
            {
                int n = mapWords.get(inputCharArray[i]);
                mapWords.put(inputCharArray[i], ++n);
            }
            // Otherwise, puts the word into the HashMap
            else
            {
                mapWords.put(inputCharArray[i], 1);
            }
        }
      /*  for (Map.Entry entry : mapWords.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/
      Map<String,Boolean> outputMap= new HashMap<>();
         Boolean val=true;
        for (Map.Entry entry : mapWords.entrySet())
        {
            if((Integer)entry.getValue() >=2)
            {
                val=true;
            }
            else
                val=false;
            outputMap.put((String) entry.getKey(),val);
        }
        for (Map.Entry entry : outputMap.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
