package br.com.ifba.giovaneneves.oopregistrationproject.model;

//--+ Imports +--//
import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//--+ END Imports +--//

@MappedSuperclass
@Data
public class AbstractEntity {

    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

}
