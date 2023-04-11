package br.com.ifba.giovaneneves.oopregistrationproject.service;

//--+ Imports +--//

import br.com.ifba.giovaneneves.oopregistrationproject.dao.StudentDAOImpl;
import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;

import java.util.List;
//--+ END Imports +--//

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
    public boolean saveStudent(Student student){

        return this.getStudentDaoImpl().save(student);

    }

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID, null otherwise.
     */
    public Student findStudentById(int id){

        return studentDaoImpl.findById(id, Student.class);

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

        return this.getStudentDaoImpl().remove(id, Student.class);

    }

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean updateStudent(Student student){

        return this.getStudentDaoImpl().update(student, Student.class);

    }


}
