package com.stackroute.main;

import java.util.Comparator;

public class  StudentSorter implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2)
    {
       int  nameCompare= student1.getStudentName().compareTo(student2.getStudentName());
       int ageCompare=(-student1.getStudentAge()+student2.getStudentAge());
       int idCompare=(student2.getStudentId()-student1.getStudentId());

      if(ageCompare==0)
      {
          if(nameCompare==0)
          {
              return idCompare;
          }
          else {
              return nameCompare;
          }
      }
      else {
          return ageCompare;
      }
    }
}
