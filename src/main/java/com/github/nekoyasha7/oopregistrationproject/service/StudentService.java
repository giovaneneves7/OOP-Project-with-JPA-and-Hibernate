package com.github.nekoyasha7.oopregistrationproject.service;

import com.github.nekoyasha7.oopregistrationproject.dao.StudentDAOImpl;
import com.github.nekoyasha7.oopregistrationproject.model.Student;

import java.util.List;

public class StudentService {

    //----------------------------------{ ATTRIBUTES }----------------------------------//

    private final StudentDAOImpl studentDaoImpl;

    //----------------------------------{ GETTERS AND SETTERS }----------------------------------//

    public StudentDAOImpl getStudentDaoImpl() {
        return studentDaoImpl;
    }

    //----------------------------------{ CONSTRUCTOR }----------------------------------//

    public StudentService(){

        studentDaoImpl = new StudentDAOImpl();
    }

    //----------------------------------{ METHODS }----------------------------------//

    /**
     *
     * Inserts a student int the database
     * @param student to be added to the database.
     */
    public void addStudent(Student student){

        this.getStudentDaoImpl().add(student);

    }

    public Student findStudentById(int id){

        return studentDaoImpl.findById(id);

    }

    public List<Student> listAllStudents(Student student){

        return this.getStudentDaoImpl().listStudents();

    }

    public boolean removeStudent(int id){

        return this.getStudentDaoImpl().remove(id);

    }

    public boolean updateStudent(Student student){

        return this.getStudentDaoImpl().update(student);

    }


}
