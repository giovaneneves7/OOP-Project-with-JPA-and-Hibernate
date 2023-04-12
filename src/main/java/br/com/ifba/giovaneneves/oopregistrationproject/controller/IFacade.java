package br.com.ifba.giovaneneves.oopregistrationproject.controller;

import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.ExistingRegistrationNumberException;
import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.InvalidRegistrationNumberException;
import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.StudentNotFoundException;
import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;

import java.util.List;

public interface IFacade {

    //---------------------------+ Student +--------------------------//
    /**
     *
     * Inserts a student int the database
     * @param student to be added to the database.
     */
    boolean saveStudent(Student student) throws ExistingRegistrationNumberException, InvalidRegistrationNumberException;

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID, null otherwise.
     */
    Student findStudentById(int id) throws StudentNotFoundException;

    /**
     * List all students.
     * @return a list with all students in the database.
     */
    List<Student> listAllStudents();

    /**
     *
     * @param id of the student to be removed from the database.
     * @return true if the student exists, false otherwise.
     */
    boolean removeStudent(int id) throws StudentNotFoundException;

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    boolean updateStudent(Student student) throws StudentNotFoundException;


}
