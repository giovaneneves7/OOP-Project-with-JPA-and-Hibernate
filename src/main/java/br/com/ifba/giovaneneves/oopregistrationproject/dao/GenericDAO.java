package br.com.ifba.giovaneneves.oopregistrationproject.dao;

import br.com.ifba.giovaneneves.oopregistrationproject.model.AbstractEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class GenericDAO<Entity extends AbstractEntity> {

    private static EntityManager entityManager;

    static{
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("sql10610591");
        setEntityManager(factory.createEntityManager());
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManagerInstance) {
        entityManager = entityManagerInstance;
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
     * @param entity to be updated.
     * @return true if the student exists in the database and the update was successful, false otherwise.
     */
    public boolean update(Entity entity, Class<Entity> type){

        boolean wasUpdated = false;

        Entity existingEntity = getEntityManager().find(type, entity.getId());
        try{

            getEntityManager().getTransaction().begin();
            getEntityManager().detach(existingEntity);
            getEntityManager().merge(entity);
            getEntityManager().getTransaction().commit();
            wasUpdated = true;

        } catch(Exception e){

            JOptionPane.showMessageDialog(null, "Update error!" ,"Update", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();

        }

        return wasUpdated;
    }
}
