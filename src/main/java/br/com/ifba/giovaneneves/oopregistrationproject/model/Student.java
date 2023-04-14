//--+ Package +--//
package br.com.ifba.giovaneneves.oopregistrationproject.model;
//--+ END Package +--//

//--+ Imports +--//
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
//--+ END Imports +--//

/**
 *
 * @author GiovaneNeves
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "students")
@Data
public class Student extends AbstractEntity{
    
    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String registrationNumber;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false)
    private int academicYear;

    @Column(nullable = false)
    private float[] grades = new float[3];

    @Column(nullable = false)
    private float averageGrades;
    
    
}
