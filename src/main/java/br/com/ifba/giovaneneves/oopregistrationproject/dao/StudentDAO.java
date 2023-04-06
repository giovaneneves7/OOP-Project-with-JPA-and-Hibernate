package br.com.ifba.giovaneneves.oopregistrationproject.dao;

//--+ Imports +--//

import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;

import java.util.List;

//--+ END Imports +--//

public abstract class StudentDAO extends GenericDAO<Student>{

    /**
     * List all students.
     * @return a list with all students in the database.
     */
    public abstract List<Student> listStudents();

}
