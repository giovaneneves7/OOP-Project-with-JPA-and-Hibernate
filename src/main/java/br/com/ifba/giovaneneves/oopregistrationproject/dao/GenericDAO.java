package br.com.ifba.giovaneneves.oopregistrationproject.dao;


import br.com.ifba.giovaneneves.oopregistrationproject.connection.ConnectionFactory;
import br.com.ifba.giovaneneves.oopregistrationproject.model.AbstractEntity;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

public class GenericDAO<Entity extends AbstractEntity> {

    private ConnectionFactory connectionFactory;

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }

    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
        connectionFactory.connect();
    }

    public GenericDAO(){

        this.setConnectionFactory(new ConnectionFactory());

    }

    /**
     *
     * Inserts an Entity in the database
     * @param entity to be added to the database.
     */
    public void add(Entity entity){

        EntityManager entityManager = this.getConnectionFactory().getEntityManager();

        try{

            entityManager.getTransaction().begin();
            entityManager.persist(entity);
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
     * @param entityType of class.
     * @return Entity with the specified ID, null otherwise.
     */
    public Entity findById(int id, Class<Entity> entityType){

        EntityManager entityManager = this.getConnectionFactory().getEntityManager();

        Entity entity = entityManager.find(entityType, id);

        entityManager.close();

        return entity;
    }

    /**
     *
     * @param id of the student to be removed from the database.
     * @param entityType of class.
     * @return true if the student exists, false otherwise.
     */
    public boolean remove(int id, Class<Entity> entityType){

        boolean wasRemoved = false;
        EntityManager entityManager = this.getConnectionFactory().getEntityManager();

        Entity entityToBeRemoved = entityManager.find(entityType, id);

        if(entityToBeRemoved != null){

            entityManager.getTransaction().begin();
            entityManager.remove(entityToBeRemoved);
            entityManager.getTransaction().commit();

            wasRemoved = true;
        }

        entityManager.close();

        return wasRemoved;
    }

    /**
     *
     * @param entity to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean update(Entity entity, Class<Entity> type){

        boolean wasUpdated = false;
        EntityManager entityManager = this.getConnectionFactory().getEntityManager();
        Entity existingEntity = entityManager.find(type, entity.getId());
        try{

            entityManager.getTransaction().begin();
            entityManager.detach(existingEntity);
            entityManager.merge(entity);
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
