package br.com.ifba.giovaneneves.oopregistrationproject.controller;

import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;

import java.util.List;

public interface IFacade {

    //---------------------------+ Student +--------------------------//
    boolean saveStudent(Student student);
    Student findStudentById(int id);
    boolean removeStudent(int id);
    boolean updateStudent(Student Student);
    List<Student> listAllStudents();


}
