package com.stackroute.main;

import java.util.HashMap;
import java.util.Map;

public class Q2
{
    public static void main(String[] args)
    {
        String inputString="one one -one___two,,three,one @three*one?two";
        String words[]=inputString.split("[\\s,.?@*_-]+");
        Map<String,Integer>mapWords= new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }
        /*  use map */
        for(int i=0;i<words.length;i++)
        {
            if (mapWords.containsKey(words[i]))
            {
                int n = mapWords.get(words[i]);
                mapWords.put(words[i], ++n);
            }
            // Otherwise, puts the word into the HashMap
            else
            {
                mapWords.put(words[i], 1);
            }
        }
        /* print keys and values */
        for (Map.Entry entry : mapWords.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
