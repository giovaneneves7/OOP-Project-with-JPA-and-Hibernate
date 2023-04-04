package com.github.nekoyasha7.oopregistrationproject.dao;

//--+ Imports +--//
import com.github.nekoyasha7.oopregistrationproject.connection.ConnectionFactory;
import com.github.nekoyasha7.oopregistrationproject.model.Student;

import javax.persistence.EntityManager;
import java.util.List;
//--+ END Imports +--//

public class StudentDAOImpl implements StudentDAO{
    private final ConnectionFactory connectionFactory;

    public StudentDAOImpl(){

        connectionFactory = new ConnectionFactory();
        connectionFactory.connect();

    }

    /**
     *
     * Inserts a student int the database
     * @param student to be added to the database.
     */
    @Override
    public void add(Student student){

        EntityManager entityManager = connectionFactory.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(student);

        entityManager.getTransaction().commit();

        entityManager.close();

    }

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @return student with the specified ID, null otherwise.
     */
    @Override
    public Student findById(int id){

        EntityManager entityManager = connectionFactory.getEntityManager();

        Student student = entityManager.find(Student.class, id);

        entityManager.close();

        return student;
    }

    /**
     * List all students.
     * @return a list with all students in the database.
     */
    @Override
    public List<Student> listStudents(){

        EntityManager entityManager = connectionFactory.getEntityManager();
        List<Student> students = entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();


        return students;

    }
    /**
     *
     * @param id of the student to be removed from the database.
     * @return true if the student exists, false otherwise.
     */
    @Override
    public boolean remove(int id){

        boolean wasRemoved = false;
        EntityManager entityManager = connectionFactory.getEntityManager();

        Student studentToBeRemoved = entityManager.find(Student.class, id);

        if(studentToBeRemoved != null){

            entityManager.getTransaction().begin();
            entityManager.remove(studentToBeRemoved);
            entityManager.getTransaction().commit();

            wasRemoved = true;
        }

        entityManager.close();

        return wasRemoved;
    }

    /**
     *
     * @param student to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    @Override
    public boolean update(Student student){

        boolean wasUpdated = false;
        EntityManager entityManager = connectionFactory.getEntityManager();

        Student existingStudent = entityManager.find(Student.class, student.getId());

        if(existingStudent != null){

            entityManager.getTransaction().begin();

            existingStudent.setName(student.getName());
            existingStudent.setRegistrationNumber(student.getRegistrationNumber());
            existingStudent.setGrades(student.getGrades());

            entityManager.getTransaction().commit();

            wasUpdated = true;
        }

        entityManager.close();
        return wasUpdated;
    }
}
