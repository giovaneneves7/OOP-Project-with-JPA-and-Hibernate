package br.com.ifba.giovaneneves.oopregistrationproject.dao;

import br.com.ifba.giovaneneves.oopregistrationproject.model.AbstractEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class GenericDAO<Entity extends AbstractEntity> {

    //----------------------------------{ ATTRIBUTES }----------------------------------//
    private static EntityManager entityManager;

    //----------------------------------{ GETTERS AND SETTERS }----------------------------------//
    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManagerInstance) {
        entityManager = entityManagerInstance;
    }

    //----------------------------------{ METHODS }----------------------------------//
    static{
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sql10610591");
        setEntityManager(factory.createEntityManager());
    }


    /**
     *
     * Inserts an Entity in the database
     * @param entity to be added to the database.
     */
    public boolean save(Entity entity){

        boolean successfullySaved = false;

        try{

            getEntityManager().getTransaction().begin();
            getEntityManager().persist(entity);
            getEntityManager().getTransaction().commit();

            successfullySaved = true;

        } catch(Exception e){

            JOptionPane.showMessageDialog(null, "Error in getTrasaction!", "Save", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();

        }

        return successfullySaved;

    }

    /**
     *
     * Search a student in the database
     * @param id of the student to be searched.
     * @param entityType of class.
     * @return Entity with the specified ID, null otherwise.
     */
    public Entity findById(int id, Class<Entity> entityType){

        Entity entity = getEntityManager().find(entityType, id);

        return entity;
    }

    /**
     *
     * @param entityToBeRemoved The entity to be removed from the database.
     * @return true if the student exists, false otherwise.
     */
    public boolean remove(Entity entityToBeRemoved){

        boolean wasRemoved = false;

        try{

                getEntityManager().getTransaction().begin();
                getEntityManager().remove(entityToBeRemoved);
                getEntityManager().getTransaction().commit();

                wasRemoved = true;

            } catch(Exception ex){

                ex.printStackTrace();
                getEntityManager().getTransaction().rollback();

            }

        return wasRemoved;
    }

    /**
     *
     * @param entityToBeUpdated The entity to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean update(Entity entityToBeUpdated){

        boolean wasUpdated = false;

        try{

            getEntityManager().getTransaction().begin();
            getEntityManager().merge(entityToBeUpdated);
            getEntityManager().getTransaction().commit();
            wasUpdated = true;

        } catch(Exception e){

            e.printStackTrace();
            getEntityManager().getTransaction().rollback();

        }

        return wasUpdated;
    }
}
