package com.example.class3demo.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
    public static final Model instance=new Model();
    private Model(){
        Student s=new Student("name", "11"+0,false,"dd","aa");
        data.add(s);
      /* for(int i=0; i<100;i++){
            Student s=new Student("name", ""+i,false);
            data.add(s);
        }
*/
    }

    List<Student> data=new LinkedList<Student>();

    public List<Student> getAllStudents(){
        return data;
    }

    public void addStudent(Student student){
        data.add(student);
    }
}
