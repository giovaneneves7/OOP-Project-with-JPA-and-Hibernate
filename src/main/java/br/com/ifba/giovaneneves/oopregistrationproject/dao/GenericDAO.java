package br.com.ifba.giovaneneves.oopregistrationproject.dao;


import br.com.ifba.giovaneneves.oopregistrationproject.connection.ConnectionFactory;
import br.com.ifba.giovaneneves.oopregistrationproject.model.AbstractEntity;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class GenericDAO<T extends AbstractEntity> {

    private final ConnectionFactory connectionFactory;

    public GenericDAO(){

        connectionFactory = new ConnectionFactory();
        connectionFactory.connect();

    }

    /**
     *
     * Inserts a T int the database
     * @param t to be added to the database.
     */
    public void add(T t){

        EntityManager entityManager = connectionFactory.getEntityManager();

        try{

            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();

        } catch(Exception e){

            JOptionPane.showMessageDialog(null, "Add error!", "Add", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();

        } finally {
            entityManager.close();
        }


    }

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @param type of class.
     * @return T with the specified ID, null otherwise.
     */
    public T findById(int id, Class<T> type){

        EntityManager entityManager = connectionFactory.getEntityManager();

        T t = entityManager.find(type, id);

        entityManager.close();

        return t;
    }

    /**
     *
     * @param id of the student to be removed from the database.
     * @param type of class.
     * @return true if the student exists, false otherwise.
     */
    public boolean remove(int id, Class<T> type){

        boolean wasRemoved = false;
        EntityManager entityManager = connectionFactory.getEntityManager();

        T tToBeRemoved = entityManager.find(type, id);

        if(tToBeRemoved != null){

            entityManager.getTransaction().begin();
            entityManager.remove(tToBeRemoved);
            entityManager.getTransaction().commit();

            wasRemoved = true;
        }

        entityManager.close();

        return wasRemoved;
    }

    /**
     *
     * @param t to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean update(T t, Class<T> type){

        boolean wasUpdated = false;
        EntityManager entityManager = connectionFactory.getEntityManager();
        T existingT = entityManager.find(type, t.getId());
        try{

            entityManager.getTransaction().begin();
            entityManager.detach(existingT);
            entityManager.merge(t);
            entityManager.getTransaction().commit();
            wasUpdated = true;

        } catch(Exception e){

            JOptionPane.showMessageDialog(null, "Update error!" ,"Update", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();

        } finally {

            entityManager.close();

        }

        return wasUpdated;
    }
}
