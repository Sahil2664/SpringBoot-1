package com.sahil.demo.StudentServer;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends JpaRepository<Student, Integer>{

 //   public Student save(Student student) {
  //      System.out.println("Student Information saved");
  //      return student;
    }
}
