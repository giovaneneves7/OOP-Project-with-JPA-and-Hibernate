package br.com.ifba.giovaneneves.oopregistrationproject.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@MappedSuperclass
public class AbstractEntity {

    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    //----------------------------------------------{ GETTERS AND SETTERS }----------------------------------------------//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
