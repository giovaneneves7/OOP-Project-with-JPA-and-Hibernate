package br.com.ifba.giovaneneves.oopregistrationproject.dao;

//--+ Imports +--//
import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;

import java.util.List;
//--+ END Imports +--//

public class StudentDAOImpl extends StudentDAO{

    /**
     * List all students.
     * @return a list with all students in the database.
     */
    @Override
    public List<Student> listStudents(){

        return GenericDAO.getEntityManager().createQuery("SELECT s FROM Student s", Student.class).getResultList();

    }

}
