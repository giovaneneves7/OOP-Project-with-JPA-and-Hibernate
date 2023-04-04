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

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID, null otherwise.
     */
    public Student findStudentById(int id){

        return studentDaoImpl.findById(id);

    }

    /**
     * List all students.
     * @return a list with all students in the database.
     */
    public List<Student> listAllStudents(){

        return this.getStudentDaoImpl().listStudents();

    }

    /**
     *
     * @param id of the student to be removed from the database.
     * @return true if the student exists, false otherwise.
     */
    public boolean removeStudent(int id){

        return this.getStudentDaoImpl().remove(id);

    }

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean updateStudent(Student student){

        return this.getStudentDaoImpl().update(student);

    }


}
