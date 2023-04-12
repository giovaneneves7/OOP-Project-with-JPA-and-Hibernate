package br.com.ifba.giovaneneves.oopregistrationproject.service;

//--+ Imports +--//

import br.com.ifba.giovaneneves.oopregistrationproject.controller.FacadeInstance;
import br.com.ifba.giovaneneves.oopregistrationproject.dao.StudentDAOImpl;
import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.ExistingRegistrationNumberException;
import br.com.ifba.giovaneneves.oopregistrationproject.exceptions.student.StudentNotFoundException;
import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;

import java.util.List;
//--+ END Imports +--//

public class StudentService {

    //----------------------------------{ ATTRIBUTES }----------------------------------//
    private final static String REGISTRATION_NUMBER_ALREADY_EXISTS = "The specified registration number already exists in the database";
    private final static String STUDENT_NOT_FOUND = "The specified student could not be found";
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
     * Inserts a student in the database
     * @param student to be added to the database.
     */
    public boolean saveStudent(Student student) throws ExistingRegistrationNumberException{

        //--+ Checks if there is already a student with the same enrollment number in the database +--//
        if(FacadeInstance.getInstance().listAllStudents().stream()
                .anyMatch(s -> s.getRegistrationNumber().equals(student.getRegistrationNumber())))
                    throw new ExistingRegistrationNumberException(REGISTRATION_NUMBER_ALREADY_EXISTS);
        
        return this.getStudentDaoImpl().save(student);

    }

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID.
     */
    public Student findStudentById(int id) throws StudentNotFoundException{
        Student foundStudent = studentDaoImpl.findById(id, Student.class);

        //--+ Checks if there is a student with the specified id +--//
        if(foundStudent == null)
            throw new StudentNotFoundException(STUDENT_NOT_FOUND);

        return foundStudent;

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
    public boolean removeStudent(int id) throws StudentNotFoundException {

        Student foundStudent = studentDaoImpl.findById(id, Student.class);

        //--+ Checks if there is a student with the specified id +--//
        if(foundStudent == null)
            throw new StudentNotFoundException(STUDENT_NOT_FOUND);

        return this.getStudentDaoImpl().remove(foundStudent);

    }

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean updateStudent(Student student) throws StudentNotFoundException{

        //--+ Checks if the student is contained in the database +--//
        if(!FacadeInstance.getInstance().listAllStudents().contains(student))
            throw new StudentNotFoundException(STUDENT_NOT_FOUND);

        return this.getStudentDaoImpl().update(student);

    }


}
