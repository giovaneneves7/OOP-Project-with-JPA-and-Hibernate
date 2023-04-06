package br.com.ifba.giovaneneves.oopregistrationproject.dao;

//--+ Imports +--//
import br.com.ifba.giovaneneves.oopregistrationproject.connection.ConnectionFactory;
import br.com.ifba.giovaneneves.oopregistrationproject.model.Student;

import javax.persistence.EntityManager;
import java.util.List;
//--+ END Imports +--//

public class StudentDAOImpl extends StudentDAO{
    private final ConnectionFactory connectionFactory;

    public StudentDAOImpl(){

        connectionFactory = new ConnectionFactory();
        connectionFactory.connect();

    }


    /**
     * List all students.
     * @return a list with all students in the database.
     */
    @Override
    public List<Student> listStudents(){

        EntityManager entityManager = connectionFactory.getEntityManager();


        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();

    }

}
