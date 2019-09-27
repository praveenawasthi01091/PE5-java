package com.stackroute.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        Student obj1= new Student(123,"Praveen",22);
        Student obj2= new Student(124,"Praveen",22);
        Student obj3= new Student(125,"Praveen",23);
        Student obj4= new Student(126,"Ashish",23);
        Student obj5= new Student(127,"Akash",22);
        //System.out.println(obj3.getGetStudentAge());
        List<Student>studentList=new ArrayList<>();
        studentList.add(obj1);
        studentList.add(obj2);
        studentList.add(obj3);
        studentList.add(obj4);
        studentList.add(obj5);
        /* print before sorting*/
        System.out.println("Before Sorting: ");
        Iterator<Student>it=studentList.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        Collections.sort(studentList, new StudentSorter());
         System.out.println("After Sorting: ");
        for(Student s:studentList)
        {
            System.out.println(s);
        }
    }
}
