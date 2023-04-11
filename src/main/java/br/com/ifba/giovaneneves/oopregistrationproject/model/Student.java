//--+ Package +--//
package br.com.ifba.giovaneneves.oopregistrationproject.model;
//--+ END Package +--//

//--+ Imports +--//
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
        
import javax.persistence.Entity;
import javax.persistence.Table;
//--+ END Imports +--//

/**
 *
 * @author GiovaneNeves
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table (name = "students")
@Data
public class Student extends AbstractEntity{
    
    //----------------------------------------------{ ATTRIBUTES }----------------------------------------------//
    private String name;
    private String registrationNumber;
    private LocalDate birthDate;
    private int academicYear;
    private float[] grades = new float[3];
    private float averageGrades;
    
    
}
