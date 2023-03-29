package com.github.nekoyasha7.oopregistrationproject.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author GiovaneNeves
 */
public class ConnectionFactory {
    
    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//

    private static EntityManager entityManager;
    
    //----------------------------------------------{ GETTERS AND SETTERS}----------------------------------------------//

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManager) {
        ConnectionFactory.entityManager = entityManager;
    }

    //----------------------------------------------{ METHODS }----------------------------------------------//
    
    public static void connect(){
        
        try{
            
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("school");
            setEntityManager(factory.createEntityManager());
            System.out.println("Connnection success!");
            
        } catch(javax.persistence.PersistenceException ex){
            System.out.println("1");
            ex.printStackTrace();
        } catch(Exception ex){
            
            System.out.println(ex);
            ex.printStackTrace();
            
        }
        
        
    }
    
}
