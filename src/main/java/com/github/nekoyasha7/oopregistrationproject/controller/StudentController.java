package com.github.nekoyasha7.oopregistrationproject.controller;

//--+ Imports +--//
import com.github.nekoyasha7.oopregistrationproject.connection.ConnectionFactory;
import com.github.nekoyasha7.oopregistrationproject.model.Student;

import javax.persistence.EntityManager;

//--+ END Imports +--//

public class StudentController {

    private ConnectionFactory connectionFactory;

    public StudentController(){

        connectionFactory = new ConnectionFactory();
        connectionFactory.connect();
    }

    public void add(Student student){

        EntityManager entityManager = connectionFactory.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(student);

        entityManager.getTransaction().commit();

        entityManager.close();

    }
}
