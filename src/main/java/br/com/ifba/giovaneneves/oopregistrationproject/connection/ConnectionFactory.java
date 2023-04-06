package br.com.ifba.giovaneneves.oopregistrationproject.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author GiovaneNeves
 */
public class ConnectionFactory {
    
    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//

    private static EntityManager entityManager;
    
    //----------------------------------------------{ GETTERS AND SETTERS}----------------------------------------------//

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        ConnectionFactory.entityManager = entityManager;
    }

    //----------------------------------------------{ METHODS }----------------------------------------------//
    
    public void connect(){
        
        try{
            
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("sql10610591");
            setEntityManager(factory.createEntityManager());
            System.out.println("Connnection success!");
            
        } catch(javax.persistence.PersistenceException ex){
            ex.printStackTrace();
        } catch(Exception ex){
            
            System.out.println(ex);
            ex.printStackTrace();
            
        }
        
        
    }
    
}
